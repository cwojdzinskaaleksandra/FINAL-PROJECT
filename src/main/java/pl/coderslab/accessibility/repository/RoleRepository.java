package pl.coderslab.accessibility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.accessibility.domain.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> { //repozytorium dla Role (punkt styku z frameworkiem)
    Role findByName(String name);
}
