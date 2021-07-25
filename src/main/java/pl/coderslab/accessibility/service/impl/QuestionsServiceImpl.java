package pl.coderslab.accessibility.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.accessibility.model.Questions;
import pl.coderslab.accessibility.repository.QuestionsRepository;
import pl.coderslab.accessibility.service.QuestionsService;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionsServiceImpl implements QuestionsService {

    private final QuestionsRepository questionsRepository;

    @Autowired
    public QuestionsServiceImpl(QuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;
    }

    @Override
    public void addQuestion(Questions questions) {
        questionsRepository.save(questions);
    }

    @Override
    public void deleteQuestion(Long id) {
        questionsRepository.deleteById(id);
    }

    @Override
    public Optional<Questions> findQuestionById(Long id) {
        return questionsRepository.findById(id);
    }

    @Override
    public void updateQuestion(Questions questions) {
        questionsRepository.save(questions);
    }

    @Override
    public List<Questions> findAllQuestions() {
        return questionsRepository.findAll();
    }
}
