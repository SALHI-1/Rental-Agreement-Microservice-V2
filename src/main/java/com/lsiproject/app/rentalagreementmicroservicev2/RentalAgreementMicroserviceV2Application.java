package com.lsiproject.app.rentalagreementmicroservicev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RentalAgreementMicroserviceV2Application {

    public static void main(String[] args) {
        SpringApplication.run(RentalAgreementMicroserviceV2Application.class, args);
    }

}
