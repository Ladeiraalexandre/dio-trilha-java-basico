package ed.estudos.service.impl;

import java.util.NoSuchElementException;

import ed.estudos.domain.model.User;
import ed.estudos.repository.IUserRepository;
import ed.estudos.service.UserService;

public class UserServiceImpl implements UserService {
	
	private final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}


