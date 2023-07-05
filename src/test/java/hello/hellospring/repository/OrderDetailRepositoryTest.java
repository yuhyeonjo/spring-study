package hello.hellospring.repository;

import hello.hellospring.HelloSpringApplicationTests;
import hello.hellospring.model.entity.OrderDetail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class OrderDetailRepositoryTest extends HelloSpringApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setItemId(1L);
        orderDetail.setUserId(1L);
        orderDetail.setOrderAt(LocalDateTime.now());
        OrderDetail newOrderDeatil = orderDetailRepository.save(orderDetail);
        Assertions.assertNotNull(newOrderDeatil);
    }

    @Test
    public void read() {
        Optional<OrderDetail> orderDetail = orderDetailRepository.findById(1L);
        Assertions.assertNotNull(orderDetail);
        System.out.println(orderDetail);
    }
}
