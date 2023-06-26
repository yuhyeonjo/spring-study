package hello.hellospring.controller;

import hello.hellospring.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // HTML <Form> 태그
    // ajax 검색
    // http post body -> data
    // json, xml, multipart-form / text-plain

    // @RequestMapping(method = RequestMethod.POST, path = "postMethod") == @PostMapping("/postMethod")
    @PostMapping("/postMethod")
    public SearchParam PostMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }


}
