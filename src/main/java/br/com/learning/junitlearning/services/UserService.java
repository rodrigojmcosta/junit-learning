package br.com.learning.junitlearning.services;

import br.com.learning.junitlearning.domain.User;
import br.com.learning.junitlearning.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO userDTO);

    User update(UserDTO userDTO);

}
