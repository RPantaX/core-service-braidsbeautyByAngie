package com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.commands;

import com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.requests.RequestProductsEvent;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReserveProductCommand {
    private Long shopOrderId;
    private List<RequestProductsEvent> requestProductsEventList;
    private Long reservationId;
}
