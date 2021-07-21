package pl.coderslab.accessibility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.accessibility.model.PossibleAnswers;
import pl.coderslab.accessibility.service.PossibleAnswersService;

import java.util.List;

@Controller
public class PossibleAnswersController {
    private final PossibleAnswersService possibleAnswersService;


    @Autowired
    public PossibleAnswersController(PossibleAnswersService possibleAnswersService) {
        this.possibleAnswersService = possibleAnswersService;
    }
    
    @GetMapping("/possibleAnswers")
    @ResponseBody
    public String possibleAnswersList(Model model){
        List<PossibleAnswers> possibleAnswersList = possibleAnswersService.findAllPossibleAnswers();
        model.addAttribute("possibleAnswersList", possibleAnswersList);
        return "possibleAnswersList";
    }
    
}
