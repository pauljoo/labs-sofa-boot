package info.xpanda.labs.sofa.boot.plugin.api;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Paul Jiang
 * @since 20200204
 */
@SpringBootApplication
public class PluginApiApplication {
    public static void main(String[] args) {
        SofaArkBootstrap.launch(args);
        SpringApplication.run(PluginApiApplication.class, args);
    }
}
