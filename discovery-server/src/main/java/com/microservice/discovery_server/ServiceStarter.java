package com.microservice.discovery_server;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class ServiceStarter {

    @PostConstruct
    public void startServices() {
        try {
            // Starting Config Server
            System.out.println("Starting Config Server...");
            ProcessBuilder configServer = new ProcessBuilder("java", "-jar", "D:/Software Developer/Microservice Practise/microservices-jars/config-server-0.0.1-SNAPSHOT.jar");
            configServer.start();
            
            // Starting User Service
            System.out.println("Starting User Service...");
            ProcessBuilder userService = new ProcessBuilder("java", "-jar", "D:/Software Developer/Microservice Practise/microservices-jars/user-service-0.0.1-SNAPSHOT.jar");
            userService.start();

            // Starting Order Service
            System.out.println("Starting Order Service...");
            ProcessBuilder orderService = new ProcessBuilder("java", "-jar", "D:/Software Developer/Microservice Practise/microservices-jars/order-service-0.0.1-SNAPSHOT.jar");
            orderService.start();
            
            // Starting Payment Service
            System.out.println("Starting Payment Service...");
            ProcessBuilder paymentService = new ProcessBuilder("java", "-jar", "D:/Software Developer/Microservice Practise/microservices-jars/payment-service-0.0.1-SNAPSHOT.jar");
            paymentService.start();

            // Starting API Gateway
            System.out.println("Starting API Gateway...");
            ProcessBuilder apiGateway = new ProcessBuilder("java", "-jar", "D:/Software Developer/Microservice Practise/microservices-jars/api-gateway-0.0.1-SNAPSHOT.jar");
            apiGateway.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
