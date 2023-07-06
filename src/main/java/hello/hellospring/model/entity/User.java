package hello.hellospring.model.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.criterion.Order;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

// DB의 테이블명과 동일하게 class명 생성 = @Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // == table
@ToString(exclude = {"orderGroup"})
@EntityListeners(AuditingEntityListener.class)
@Builder
@Accessors(chain = true)
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 동일한 컬럼명이면 생략가능 @Column(name = "account")
    private String account;
    private String password;
    private String status;
    private String email;
    private String phoneNumber;
    private LocalDateTime registeredAt;
    private LocalDateTime unregisteredAt;

    @CreatedDate
    private LocalDateTime createdAt;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @LastModifiedBy
    private String updatedBy;

    // User 1 : N OrderGroup
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<OrderGroup> orderGroupList;
}
