package hello.hellospring.controller.api;

import hello.hellospring.ifs.CrudInterface;
import hello.hellospring.model.network.Header;
import hello.hellospring.model.network.request.ItemApiRequest;
import hello.hellospring.model.network.response.ItemApiResponse;
import hello.hellospring.service.ItemApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/item")
public class ItemApiController implements CrudInterface<ItemApiRequest, ItemApiResponse> {

    @Autowired
    private ItemApiLogicService itemApiLogicService;

    @Override
    @PostMapping("") // /api/item
    public Header<ItemApiResponse> create(@RequestBody Header<ItemApiRequest> request) {
        return itemApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}") // /api/item/1 ...1000
    public Header<ItemApiResponse> read(@PathVariable Long id) {
        return itemApiLogicService.read(id) ;
    }

    @Override
    @PutMapping("") // /api/item
    public Header<ItemApiResponse> update(@RequestBody Header<ItemApiRequest> request) {
        return itemApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}") // /api/item/1 ...1000
    public Header<ItemApiResponse> delete(@PathVariable Long id) {
        return itemApiLogicService.delete(id);
    }
}
