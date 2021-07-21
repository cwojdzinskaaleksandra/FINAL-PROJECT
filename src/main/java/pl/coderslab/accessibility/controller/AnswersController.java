package pl.coderslab.accessibility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.accessibility.model.Answers;
import pl.coderslab.accessibility.service.AnswersService;

import java.util.List;

public class AnswersController {

    private final AnswersService answersService;

    @Autowired
    public AnswersController(AnswersService answersService) {
        this.answersService = answersService;
    }

    @GetMapping("/answers")
    @ResponseBody
    public String answersList(Model model){
        List<Answers> answersList = answersService.findAllAnswers();
        model.addAttribute("answersList", answersList);
        return "answersList";
    }
}
