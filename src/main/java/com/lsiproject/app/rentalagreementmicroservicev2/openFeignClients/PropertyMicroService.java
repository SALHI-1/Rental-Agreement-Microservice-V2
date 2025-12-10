package com.lsiproject.app.rentalagreementmicroservicev2.openFeignClients;

import com.lsiproject.app.rentalagreementmicroservicev2.dtos.PropertyResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "PropertyMicroService",
        url = "http://localhost:8082"
)
public interface PropertyMicroService {

    @GetMapping("/api/property-microservice/properties/{id}")
    PropertyResponseDTO getPropertyById(@PathVariable Long id);

    @GetMapping("/api/property-microservice/properties/{id}/isAvailable")
    boolean isPropertyAvailable(@PathVariable Long id);

    @PatchMapping("/api/property-microservice/properties/{id}/availability")
    void updateAvailability(@PathVariable Long id, @RequestBody boolean available);
}
