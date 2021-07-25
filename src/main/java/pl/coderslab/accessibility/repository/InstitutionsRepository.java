package pl.coderslab.accessibility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.accessibility.model.Institutions;

import java.util.Optional;

@Repository
public interface InstitutionsRepository extends JpaRepository<Institutions, Long> {

    @Override
    Optional<Institutions> findById(Long id);

}
