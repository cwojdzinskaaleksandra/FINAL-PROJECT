package pl.coderslab.accessibility.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.accessibility.model.PossibleAnswers;
import pl.coderslab.accessibility.repository.PossibleAnswersRepository;
import pl.coderslab.accessibility.service.PossibleAnswersService;

import java.util.List;
import java.util.Optional;

@Service
public class PossibleAnswersServiceImpl implements PossibleAnswersService {

    private final PossibleAnswersRepository possibleAnswersRepository;

    @Autowired
    public PossibleAnswersServiceImpl(PossibleAnswersRepository possibleAnswersRepository) {
        this.possibleAnswersRepository = possibleAnswersRepository;
    }

    @Override
    public void addPossibleAnswer(PossibleAnswers possibleAnswers) {
        possibleAnswersRepository.save(possibleAnswers);
    }

    @Override
    public void deletePossibleAnswer(Long id) {
        possibleAnswersRepository.deleteById(id);
    }

    @Override
    public Optional<PossibleAnswers> findPossibleAnswerById(Long id) {
        return possibleAnswersRepository.findById(id);
    }

    @Override
    public void updatePossibleAnswer(PossibleAnswers possibleAnswers) {
        possibleAnswersRepository.save(possibleAnswers);
    }

    @Override
    public List<PossibleAnswers> findAllPossibleAnswers() {
        return possibleAnswersRepository.findAll();
    }
}
