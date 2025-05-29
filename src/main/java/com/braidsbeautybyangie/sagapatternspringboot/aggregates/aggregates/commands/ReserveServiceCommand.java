package com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.commands;

import com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.dto.Product;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReserveServiceCommand {
    private Long shopOrderId;
    private Long reservationId;
    private List<Product> productList;
}
