package pl.coderslab.accessibility.service;

import pl.coderslab.accessibility.model.PossibleAnswers;

import java.util.List;
import java.util.Optional;

public interface PossibleAnswersService {

    void addPossibleAnswer(PossibleAnswers possibleAnswers);
    void deletePossibleAnswer (Long id);
    Optional<PossibleAnswers> findPossibleAnswerById(Long id);
    void updatePossibleAnswer (PossibleAnswers possibleAnswers);
    List<PossibleAnswers> findAllPossibleAnswers();
}
