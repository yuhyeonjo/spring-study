package hello.hellospring.repository;

import hello.hellospring.HelloSpringApplicationTests;
import hello.hellospring.model.entity.Item;
import hello.hellospring.model.entity.User;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends HelloSpringApplicationTests {

    // Dependency Injection(DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {

        String account = "Test01";
        String password = "Test01";
        String status = "REGISTERED";
        String email = "Test01@gmail.com";
        String phoneNumber = "010-1111-1111";
        LocalDateTime registeredAt = LocalDateTime.now();
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "AdminServer";

        User user = new User();
        user.setAccount(account);
        user.setPassword(password);
        user.setStatus(status);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setRegisteredAt(registeredAt);
        user.setCreatedAt(createdAt);
        user.setCreatedBy(createdBy);

        User newUser = userRepository.save(user);

        Assertions.assertNotNull(newUser);
    }

    @Test
    //@Transactional
    public void read() {

        User user = userRepository.findFirstByPhoneNumberOrderByIdDesc("010-1111-1111");
        Assertions.assertNotNull(user);

    }

    @Test
    public void update(){
//        Optional<User> user = userRepository.findById(2L);
//
//        user.ifPresent(selectUser -> {
//            selectUser.setAccount("ppp");
//            selectUser.setUpdatedAt(LocalDateTime.now());
//            selectUser.setUpdatedBy("update method()");
//
//            userRepository.save(selectUser);
//        });

    }

    @Test
    @Transactional
    public void delete() {

//        Optional<User> user = userRepository.findById(1L);
//
//        Assertions.assertTrue(user.isPresent()); // true
//
//        user.ifPresent(selectUser -> {
//            userRepository.delete(selectUser);
//        });
//
//        Optional<User> deleteUser = userRepository.findById(1L);
//
//        Assertions.assertFalse(deleteUser.isPresent()); // false

        /*
        Assertion.assertTrue 와 동일
        if(deleteUser.isPresent()) {
            System.out.println("데이터 존재 : " + deleteUser.get());
        } else {
            System.out.println("데이터 삭제 데이터 없음");
        }
         */
    }
}
