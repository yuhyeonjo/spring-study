package hello.hellospring.model.network.response;


import hello.hellospring.model.enumclass.OrderStatus;
import hello.hellospring.model.enumclass.OrderType;
import hello.hellospring.model.enumclass.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderGroupApiResponse {

    private Long id;
    private OrderStatus status;
    private OrderType orderType;
    private String revAddress;
    private String revName;
    private PaymentType paymentType;
    private BigDecimal totalPrice;
    private Integer totalQuantity;
    private LocalDateTime orderAt;
    private LocalDateTime arrivalDate;
    private Long userId;
}
