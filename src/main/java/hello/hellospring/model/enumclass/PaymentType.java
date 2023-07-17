package hello.hellospring.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentType {

    CARD(0, "신용카드 결제"),
    CHECK_CARD(1, "체크카드 결제"),
    CASH(2, "현금 결제"),
    BANK_TRANSFER(3, "계좌 이체");

    private Integer id;
    private String title;

}
