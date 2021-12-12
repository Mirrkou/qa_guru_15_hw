package hw15.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import hw15.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void apiTest() {
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(apiConfig.baseUrl()).isEqualTo("https://github.com/Mirrkou");
        assertThat(apiConfig.token()).isEqualTo("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");
    }

}
