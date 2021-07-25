package pl.coderslab.accessibility.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/addQuestion")
    public String addQuestionShow(Model model) {
        model.addAttribute("question", new Questions());
        return "addQuestion";
    }

    @PostMapping(value = "/addQuestion")
    public String addQuestionPerform(@RequestParam String description,
                                     Model model){
        Questions question = new Questions();
        question.setDescription(description);
        questionsService.addQuestion(question);
        return "successAddQuestion";
    }

}
