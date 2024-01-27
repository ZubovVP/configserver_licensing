package ru.zubov.configserver_licensing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerLicensingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerLicensingApplication.class, args);
    }

}
