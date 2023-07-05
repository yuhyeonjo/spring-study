package hello.hellospring.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

// DB의 테이블명과 동일하게 class명 생성 = @Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // == table
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 동일한 컬럼명이면 생략가능 @Column(name = "account")
    private String account;
    private String email;
    private String phoneNumber;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}
