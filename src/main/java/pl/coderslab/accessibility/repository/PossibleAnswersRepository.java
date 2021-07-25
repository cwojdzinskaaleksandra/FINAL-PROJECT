package pl.coderslab.accessibility.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.accessibility.model.PossibleAnswers;

import java.util.Optional;

@Repository
public interface PossibleAnswersRepository extends JpaRepository<PossibleAnswers, Long> {

    @Override
    Optional<PossibleAnswers> findById(Long id);
}
