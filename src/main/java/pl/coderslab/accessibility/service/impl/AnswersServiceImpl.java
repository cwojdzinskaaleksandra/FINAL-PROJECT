package pl.coderslab.accessibility.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.accessibility.model.Answers;
import pl.coderslab.accessibility.repository.AnswersRepository;
import pl.coderslab.accessibility.service.AnswersService;

import java.util.List;
import java.util.Optional;

@Service
public class AnswersServiceImpl implements AnswersService {

    private  final AnswersRepository answersRepository;

    @Autowired
    public AnswersServiceImpl(AnswersRepository answersRepository) {
        this.answersRepository = answersRepository;
    }

    @Override
    public void addAnswer(Answers answers) {
        answersRepository.save(answers);
    }

    @Override
    public void deleteAnswer(Long id) {
        answersRepository.deleteById(id);
    }

    @Override
    public Optional<Answers> findAnswerById(Long id) {
        return answersRepository.findById(id);
    }

    @Override
    public void updateAnswer(Answers answers) {
        answersRepository.save(answers);
    }

    @Override
    public List<Answers> findAllAnswers() {
        return answersRepository.findAll();
    }
}
