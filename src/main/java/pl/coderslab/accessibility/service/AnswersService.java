package pl.coderslab.accessibility.service;

import jdk.nashorn.internal.ir.Optimistic;
import pl.coderslab.accessibility.model.Answers;

import java.util.List;
import java.util.Optional;

public interface AnswersService {

    void addAnswer(Answers answers);
    void deleteAnswer(Long id);
    Optional<Answers> findAnswerById(Long id);
    void updateAnswer (Answers answers);
    List<Answers> findAllAnswers();
}
