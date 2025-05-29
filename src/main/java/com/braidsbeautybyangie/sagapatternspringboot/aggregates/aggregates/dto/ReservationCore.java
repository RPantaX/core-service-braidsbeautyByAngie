package com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.dto;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ReservationCore {
    private Long reservationId;
    private BigDecimal totalPrice;
}
