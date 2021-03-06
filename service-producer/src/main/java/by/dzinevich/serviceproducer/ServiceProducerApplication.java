package by.dzinevich.serviceproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ServiceProducerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServiceProducerApplication.class, args);
  }

}
