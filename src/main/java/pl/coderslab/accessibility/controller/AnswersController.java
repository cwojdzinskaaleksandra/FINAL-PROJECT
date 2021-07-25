package pl.coderslab.accessibility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.accessibility.model.Answers;
import pl.coderslab.accessibility.service.AnswersService;

@Controller
public class AnswersController {
    private final AnswersService answersService;

    @Autowired
    public AnswersController(AnswersService answersService) {
        this.answersService = answersService;
    }

    @GetMapping("/addAnswers")
    public String addAnswersShow(){
        return "/addAnswers";
    }
//    @PostMapping(value = "/addAnswers")
//    public String addAnswersPerform()
}
