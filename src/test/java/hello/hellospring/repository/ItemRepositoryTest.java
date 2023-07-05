package hello.hellospring.repository;

import hello.hellospring.HelloSpringApplicationTests;
import hello.hellospring.model.entity.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;


public class ItemRepositoryTest extends HelloSpringApplicationTests {


    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create() {
        Item item = new Item();
        item.setStatus("UNREGISTERED");
        item.setName("삼성 노트북");
        item.setTitle("갤럭시북");
        item.setContent("2023년형 노트북");
        item.setPrice(1000000);
        item.setBrandName("Samsung");
        item.setRegisteredAt(LocalDateTime.now());
        item.setCreatedAt(LocalDateTime.now());
        item.setCreatedBy("Partner01");
        // item.setPartnerId(1L);

        Item newItem = itemRepository.save(item);
        Assertions.assertNotNull(newItem);
    }

    @Test
    public void read() {
        Optional<Item> item = itemRepository.findById(1L);
        Assertions.assertTrue(item.isPresent());
    }
}
