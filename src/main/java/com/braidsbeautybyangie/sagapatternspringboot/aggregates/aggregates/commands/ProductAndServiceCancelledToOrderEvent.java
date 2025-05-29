package com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.commands;

import com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.dto.Product;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductAndServiceCancelledToOrderEvent {
    private List<Product> productList;
    private Long shopOrderId;
    private Long reservationId;
}
