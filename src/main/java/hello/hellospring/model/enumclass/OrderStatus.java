package hello.hellospring.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStatus {

    ORDERING(0, "준비", "배송준비"),
    CONFIRM(1, "확인", "확인중"),
    DELIVERING(2, "배송중", "배송중"),
    COMPLETE(3, "완료", "배송완료");

    private Integer id;
    private String title;
    private String description;

}
