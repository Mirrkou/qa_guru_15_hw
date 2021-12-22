package hw15.config;

import java.net.URL;
import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("remoteUrl")
    URL getRemoteUrl();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();
}