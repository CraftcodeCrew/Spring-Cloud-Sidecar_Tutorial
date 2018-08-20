package com.craftcodecrew.lumen.service.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class LumenServiceSidecarApplication {

    public static void main(String[] args) {
        SpringApplication.run(LumenServiceSidecarApplication.class, args);
    }

}
