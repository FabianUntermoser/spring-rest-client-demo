package faun.spring.rest.restfuldemo.api.services;

import faun.spring.rest.restfuldemo.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);

}
