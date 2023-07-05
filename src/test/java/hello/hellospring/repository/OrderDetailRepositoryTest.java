package hello.hellospring.repository;

import hello.hellospring.HelloSpringApplicationTests;
import hello.hellospring.model.entity.OrderDetail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

public class OrderDetailRepositoryTest extends HelloSpringApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setStatus("WAITING");
        orderDetail.setArrivalDate(LocalDateTime.now().plusDays(2));
        orderDetail.setQuantity(1);
        orderDetail.setTotalPrice(BigDecimal.valueOf(1000000));
        orderDetail.setCreatedAt(LocalDateTime.now());
        orderDetail.setCreatedBy("AdminServer");
        // orderDetail.setOrderGroupId(1L); // 어떠한 장바구니에 Long -> OrderGroup
        // orderDetail.setItemId(1L); // 어떠한 상품
        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
        Assertions.assertNotNull(newOrderDetail);
    }

    @Test
    public void read() {
//        Optional<OrderDetail> orderDetail = orderDetailRepository.findById(1L);
//        Assertions.assertNotNull(orderDetail);
//        System.out.println(orderDetail);
    }
}
