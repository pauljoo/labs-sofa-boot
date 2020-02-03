package info.xpanda.labs.framework.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "info.xpanda.labs.framework.api",
        "info.xpanda.labs.framework.conflict.provider",
        "info.xpanda.labs.framework.cat.provider"
})
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
