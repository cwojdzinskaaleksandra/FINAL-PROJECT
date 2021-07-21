package pl.coderslab.accessibility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.accessibility.model.Questions;

import java.util.Optional;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Long> {

    @Override
    Optional<Questions> findById(Long id);
}
