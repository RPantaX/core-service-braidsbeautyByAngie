package com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.events;

import com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.requests.RequestProductsEvent;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreatedEvent {
    private Long shopOrderId;
    private Long customerId;
    private List<RequestProductsEvent> requestProductsEventList;
    private Long reservationId;
}
