package br.com.robligo;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ZeroCodeUnitRunner.class)
@TargetEnv("application_kafka_c.properties")
public class KafkaAvroConsumer {

    @Test
    @Scenario("rest/kafka_avro_consumer_test.json")
    public void test_consumo_mensagem_kafka_avro() {
    }

}
