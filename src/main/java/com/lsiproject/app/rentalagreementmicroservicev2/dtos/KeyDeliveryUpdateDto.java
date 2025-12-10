package com.lsiproject.app.rentalagreementmicroservicev2.dtos;

import lombok.Data;

/**
 * DTO pour la mise à jour de la confirmation de remise de clé (Étape 4).
 */
@Data
public class KeyDeliveryUpdateDto {
    private Boolean isKeyDelivered;
}
