package pl.coderslab.accessibility.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.accessibility.model.Questions;
import pl.coderslab.accessibility.service.QuestionsService;

import java.util.List;

@Controller
public class QuestionsController {

    private final QuestionsService questionsService;

    @Autowired
    public QuestionsController(QuestionsService questionsService) {
        this.questionsService = questionsService;
    }

    @GetMapping("/questions")
    @ResponseBody
    public String questionsList(Model model) {
        List<Questions> questionsList = questionsService.findAllQuestions();
        model.addAttribute("questionsList", questionsList);
        return "questionsList";
    }

}
