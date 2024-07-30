package ed.estudos.service;

import ed.estudos.domain.model.User;

public interface UserService {
	
	User findById(Long id);

    User create(User userToCreate);

}
