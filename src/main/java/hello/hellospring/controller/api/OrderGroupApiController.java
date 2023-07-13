package hello.hellospring.controller.api;

import hello.hellospring.controller.CrudController;
import hello.hellospring.ifs.CrudInterface;
import hello.hellospring.model.entity.OrderGroup;
import hello.hellospring.model.network.Header;
import hello.hellospring.model.network.request.OrderGroupApiRequest;
import hello.hellospring.model.network.response.OrderGroupApiResponse;
import hello.hellospring.service.OrderApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/orderGroup")
public class OrderGroupApiController extends CrudController<OrderGroupApiRequest, OrderGroupApiResponse, OrderGroup> {

//    @Autowired
//    private OrderApiLogicService orderApiLogicService;
//
//    @PostConstruct
//    public void init() {
//        this.baseService = orderApiLogicService;
//    }

//    @Override
//    @PostMapping("")
//    public Header<OrderGroupApiResponse> create(@RequestBody Header<OrderGroupApiRequest> request) {
//        return orderApiLogicService.create(request);
//    }
//
//    @Override
//    @GetMapping("{id}")
//    public Header<OrderGroupApiResponse> read(@PathVariable Long id) {
//        return orderApiLogicService.read(id);
//    }
//
//    @Override
//    @PutMapping("")
//    public Header<OrderGroupApiResponse> update(@RequestBody Header<OrderGroupApiRequest> request) {
//        return orderApiLogicService.update(request);
//    }
//
//    @Override
//    @DeleteMapping("{id}")
//    public Header delete(@PathVariable Long id) {
//        return orderApiLogicService.delete(id);
//    }
}
