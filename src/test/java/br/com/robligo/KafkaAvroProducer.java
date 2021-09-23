package br.com.robligo;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.UseKafkaClient;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("application_kafka.properties")
@UseKafkaClient(MyCustomKafkaClient.class)
@RunWith(ZeroCodeUnitRunner.class)
public class KafkaAvroProducer {

    @Test
    @Scenario("rest/kafka_avro_test.json")
    public void test_post_message_kafka_avro() {
    }

}
