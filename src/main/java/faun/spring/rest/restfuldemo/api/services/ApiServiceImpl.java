package faun.spring.rest.restfuldemo.api.services;

import faun.spring.rest.restfuldemo.api.domain.User;
import faun.spring.rest.restfuldemo.api.domain.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;
    private String apiUrl;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String apiUrl) {
        this.restTemplate = restTemplate;
        this.apiUrl = apiUrl;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        String restUrl = UriComponentsBuilder.fromUriString(apiUrl)
                .queryParam("limit", limit)
                .toUriString();

        return restTemplate.getForObject(restUrl, UserData.class).getData();
    }

}
