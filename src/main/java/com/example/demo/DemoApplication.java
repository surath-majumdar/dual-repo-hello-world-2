package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/api/hello")
    public Map<String, String> hello() {
        return Map.of(
            "service", "dual-repo-hello-world-2",
            "costCenter", "CC-1234",
            "status", "UP",
            "message", "Governed Spring Boot service running on OrbStack Kubernetes. Updated by developer - governed by centralized OPA/Rego"
        );
    }
}