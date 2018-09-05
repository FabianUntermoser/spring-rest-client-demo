package faun.spring.rest.restfuldemo.api.services;

import faun.spring.rest.restfuldemo.api.domain.User;
import faun.spring.rest.restfuldemo.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        return restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class).getData();
    }

}
