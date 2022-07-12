package br.com.learning.junitlearning.services;

import br.com.learning.junitlearning.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

}
