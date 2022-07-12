package br.com.learning.junitlearning.services;

import br.com.learning.junitlearning.domain.User;

public interface UserService {

    User findById(Integer id);

}
