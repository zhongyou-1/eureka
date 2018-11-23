package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author xrt
 *  编写Eureka服务microservices-discovery-eureka-demo
 */
@EnableEurekaServer
@SpringBootApplication
public class MicroservicesDiscoveryEurekaDemoApplication {
	
	@RequestMapping("/")
    public String hello(){
        return "hello Eureka";
    }
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDiscoveryEurekaDemoApplication.class, args);
	}
}
