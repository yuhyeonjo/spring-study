package hello.hellospring.repository;

import hello.hellospring.HelloSpringApplicationTests;
import hello.hellospring.model.entity.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class ItemRepositoryTest extends HelloSpringApplicationTests {


    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create() {
        Item item = new Item();
        item.setName("노트북");
        item.setPrice(1000000);
        item.setContent("삼성 갤럭시북");

        Item newItem = itemRepository.save(item);
        Assertions.assertNotNull(newItem);
    }

    @Test
    public void read() {
        Optional<Item> item = itemRepository.findById(1L);
        Assertions.assertTrue(item.isPresent());
    }
}
