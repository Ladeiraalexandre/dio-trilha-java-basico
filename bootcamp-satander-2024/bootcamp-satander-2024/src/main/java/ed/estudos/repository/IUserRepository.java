package ed.estudos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ed.estudos.domain.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
	
	boolean existsByAccountNumber(String accountNumber);

}
