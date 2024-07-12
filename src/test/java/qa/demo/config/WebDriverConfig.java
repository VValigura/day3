package qa.demo.config;

//import org.aeonbits.owner.Config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:${device}.properties",
        "classpath:config.properties",
})
public interface WebDriverConfig extends Config {

    @Key("browser")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();


}
