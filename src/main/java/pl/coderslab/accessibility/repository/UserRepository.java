package pl.coderslab.accessibility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.accessibility.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String name);
}
