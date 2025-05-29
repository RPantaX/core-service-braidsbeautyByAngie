package com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.commands;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CancelReservationCommand {
    private Long shopOrderId;
    private Long reservationId;
}
