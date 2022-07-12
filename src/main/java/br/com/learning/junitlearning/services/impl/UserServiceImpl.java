package br.com.learning.junitlearning.services.impl;

import br.com.learning.junitlearning.domain.User;
import br.com.learning.junitlearning.domain.dto.UserDTO;
import br.com.learning.junitlearning.repositories.UserRepository;
import br.com.learning.junitlearning.services.UserService;
import br.com.learning.junitlearning.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() ->new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User create(UserDTO userDTO) {
        return repository.save(mapper.map(userDTO, User.class));
    }

}
