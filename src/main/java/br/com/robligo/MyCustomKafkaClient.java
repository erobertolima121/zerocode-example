package br.com.robligo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.jsmart.zerocode.core.di.provider.ObjectMapperProvider;
import org.jsmart.zerocode.core.engine.preprocessor.ScenarioExecutionState;
import org.jsmart.zerocode.core.kafka.client.BasicKafkaClient;
import org.jsmart.zerocode.core.kafka.send.message.ProducerJsonRecord;
import org.jsmart.zerocode.core.kafka.send.message.ProducerJsonRecords;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.concurrent.ScheduledExecutorTask;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@Service
public class MyCustomKafkaClient extends BasicKafkaClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyCustomKafkaClient.class);
    private boolean customCodeExecuted;
    private final DecoderFactory decoderFactory = DecoderFactory.get();
    private final ObjectMapper objectMapper = new ObjectMapperProvider().get();
    private static final String TOPIC = "inbound-service";

    public MyCustomKafkaClient() {
        super();
        LOGGER.info("Running via Deloitte custom-Kafka-client...");
    }

    public String execute(String brokers, String topicName, String operation, String requestJson, ScenarioExecutionState scenarioExecutionState) throws JSONException, JSONException, JSONException, JsonProcessingException {
        customCodeExecuted = true;

        ProducerJsonRecords jsonRecords = objectMapper.readValue(requestJson, ProducerJsonRecords.class);
        List<ProducerJsonRecord> records = jsonRecords.getRecords();
        AtomicReference<RecordMetadata> recordMetadata = new AtomicReference<>();
        records.forEach(producerJsonRecord -> {
            ClientId crp = new ClientId();

            // use Avro Deserializer to get json record from zerocode configuration
            DatumReader<ClientId> reader
                    = new SpecificDatumReader<>(ClientId.class);
            Decoder decoder;
            try {
                decoder = DecoderFactory.get().jsonDecoder(
                        ClientId.getClassSchema(), producerJsonRecord.getValue().toString());
                crp = reader.read(null, decoder);
            } catch (IOException e) {
                LOGGER.error("Deserialization error:" + e.getMessage());
            }


            Properties props = new Properties();
            props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokers);
            props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                    org.apache.kafka.common.serialization.StringSerializer.class);
            props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                    io.confluent.kafka.serializers.KafkaAvroSerializer.class);
            props.put("schema.registry.url", "http://localhost:8081");
            props.put("auto.register.schemas",false);
            KafkaProducer producer = new KafkaProducer(props);

            ProducerRecord<String, Object> producerRecord =
                    new ProducerRecord(topicName, null, null, null, crp, null);
            producer.send(producerRecord);
        });

        assertThat(true, is(true));
        return "String";
    }
}