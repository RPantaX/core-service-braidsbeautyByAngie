package com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.events;

import com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.dto.Product;
import com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.dto.ReservationCore;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceReservedEvent {
    private Long shopOrderId;
    private ReservationCore reservationCore;
    List<Product> productList;
}
