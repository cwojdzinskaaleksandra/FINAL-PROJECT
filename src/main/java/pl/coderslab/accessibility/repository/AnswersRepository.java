package pl.coderslab.accessibility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.accessibility.model.Answers;

import java.util.Optional;
@Repository
public interface AnswersRepository extends JpaRepository<Answers, Long> {

    @Override
    Optional<Answers> findById(Long id);
}
