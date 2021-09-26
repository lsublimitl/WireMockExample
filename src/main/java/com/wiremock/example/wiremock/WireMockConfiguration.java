package com.wiremock.example.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

@Component
public class WireMockConfiguration {

    @PostConstruct
    public void initWireMock() {
        new WireMockServer(options()
                .port(9090)
                .usingFilesUnderClasspath("./")
        ).start();
    }
}
