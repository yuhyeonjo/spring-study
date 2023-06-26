package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sbbController {

    @GetMapping("/sbb")
    @ResponseBody
    public String sbb() {return "안녕하세요 sbb에 오신것을 환영합니다.";}

}
