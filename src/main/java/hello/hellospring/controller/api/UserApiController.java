package hello.hellospring.controller.api;

import hello.hellospring.controller.CrudController;
import hello.hellospring.ifs.CrudInterface;
import hello.hellospring.model.entity.User;
import hello.hellospring.model.network.Header;
import hello.hellospring.model.network.request.UserApiRequest;
import hello.hellospring.model.network.response.UserApiResponse;
import hello.hellospring.service.UserApiLogicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@Slf4j // log.info 사용가능
@RestController
@RequestMapping("/api/user")
public class UserApiController extends CrudController<UserApiRequest, UserApiResponse, User> {

//    @Autowired
//    private UserApiLogicService userApiLogicService;
//
//    @PostConstruct
//    public void init() {
//        this.baseService = userApiLogicService;
//    }

//    @Override
//    @PostMapping("") // /api/user
//    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request) {
//        log.info("{}", request);
//        return userApiLogicService.create(request);
//
//    }
//
//    @Override
//    @GetMapping("{id}") // /api/user/{id}
//    public Header<UserApiResponse> read(@PathVariable(name="id") Long id) {
//        log.info("read id : {}", id);
//        return userApiLogicService.read(id);
//    }
//
//    @Override
//    @PutMapping("") // /api/user
//    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> request) {
//        return userApiLogicService.update(request);
//    }
//
//    @Override
//    @DeleteMapping("{id}") // /api/user/{id}
//    public Header delete(@PathVariable Long id) {
//        log.info("delete id : {}", id);
//        return userApiLogicService.delete(id);
//    }

}
