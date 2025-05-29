package com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.commands;

import com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.dto.PaymentType;
import com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.dto.Product;
import com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.dto.ReservationCore;
import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProcessPaymentCommand {
    private Long shopOrderId;
    private String paymentProvider;
    private BigInteger paymentAccountNumber;
    private LocalTime paymentExpirationDate;
    private boolean paymentIsDefault;
    private BigDecimal paymentTotalPrice;
    private Long userId;
    private PaymentType paymentType;
    private List<Product> productList;
    private ReservationCore reservationCore;
}
