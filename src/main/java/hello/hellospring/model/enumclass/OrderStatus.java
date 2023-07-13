package hello.hellospring.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStatus {

    PREPARE(0, "준비", "배송준비"),
    DELIVERING(1, "배송중", "배송중"),
    COMPLETE(2, "완료", "배송완료");

    private Integer id;
    private String title;
    private String description;

}
