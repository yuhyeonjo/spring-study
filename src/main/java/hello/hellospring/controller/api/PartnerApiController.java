package hello.hellospring.controller.api;

import hello.hellospring.controller.CrudController;
import hello.hellospring.model.entity.Partner;
import hello.hellospring.model.network.request.PartnerApiRequest;
import hello.hellospring.model.network.response.PartnerApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/partner")
public class PartnerApiController  extends CrudController<PartnerApiRequest, PartnerApiResponse, Partner> {
}
