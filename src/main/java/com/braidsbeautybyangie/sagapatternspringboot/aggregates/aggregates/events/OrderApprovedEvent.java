package com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.events;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderApprovedEvent {
    private Long shopOrderId;
    private Boolean isProduct;
    private Boolean isService;
}
