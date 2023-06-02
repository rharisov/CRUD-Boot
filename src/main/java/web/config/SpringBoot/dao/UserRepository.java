package web.config.SpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.config.SpringBoot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
