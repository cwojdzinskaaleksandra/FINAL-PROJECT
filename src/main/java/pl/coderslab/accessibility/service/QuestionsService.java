package pl.coderslab.accessibility.service;

import pl.coderslab.accessibility.model.Questions;

import java.util.List;
import java.util.Optional;

public interface QuestionsService {

    void addQuestion(Questions questions);
    void deleteQuestion(Long id);
    Optional<Questions> findQuestionById(Long id);
    void updateQuestion (Questions questions);
    List<Questions> findAllQuestions();
}
