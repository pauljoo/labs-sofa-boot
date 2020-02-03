package info.xpanda.labs.sofa.boot.plugin.biz;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Paul Jiang
 * @since 20200203
 */
@SpringBootApplication
public class PluginBizApplication {
    public static void main(String[] args) {
        SofaArkBootstrap.launch(args);
        SpringApplication.run(PluginBizApplication.class, args);
    }
}
