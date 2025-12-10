package com.lsiproject.app.rentalagreementmicroservicev2.dtos;

import com.lsiproject.app.rentalagreementmicroservicev2.enums.RentalRequestStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * DTO pour afficher les détails d'une demande de location.
 */
@Data
@Builder
public class RentalRequestDto {
    private Long idRequest;
    private LocalDateTime createdAt;
    private RentalRequestStatus status;
    private Long tenantId;
    private Long propertyId;
}