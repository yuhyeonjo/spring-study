package hello.hellospring.ifs;

import hello.hellospring.model.network.Header;
import hello.hellospring.model.network.request.UserApiRequest;
import hello.hellospring.model.network.response.UserApiResponse;

public interface CrudInterface<Req, Res> {
    
    Header<Res> create(Header<Req> request); // todo request object 추가
    
    Header<Res> read(Long id);
    
    Header<Res> update(Header<Req> request);

    Header<Res> delete(Long id);
}
