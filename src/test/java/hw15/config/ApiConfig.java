package hw15.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/token.properties",
        "classpath:token.properties"
})

public interface ApiConfig extends Config {

    @Key("base.url")
    @DefaultValue("https://github.com/Mirrkou")
    String baseUrl();

    @Key("token")
    String token();
}
