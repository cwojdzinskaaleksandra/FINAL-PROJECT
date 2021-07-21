package pl.coderslab.accessibility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.accessibility.model.Institutions;
import pl.coderslab.accessibility.service.InstitutionsService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class InstitutionsController {

    private final InstitutionsService institutionsService;

    @Autowired
    public InstitutionsController(InstitutionsService institutionsService) {
        this.institutionsService = institutionsService;
    }

    @GetMapping("/institutions")
    @ResponseBody
    public String institutionsList(Model model) {
        List<Institutions> institutionsList = institutionsService.findAllInstitutions();
        model.addAttribute("institutionsList", institutionsList);
        return "institutions.jsp";
    }

    @GetMapping(value = "/add")
    public String addInstitutionShow(){
        return "institutionsForm";
    }

    @PostMapping(value = "/add")
    public String addInstitutionPerform(@RequestParam String name,
                                 @RequestParam String address,
                                 @RequestParam String website,
                                 @RequestParam String phoneNumber,
                                 Model model){
        Institutions institution = new Institutions(name, address, website, phoneNumber);
        model.addAttribute("institution", institution);
        return "/institutionsAdded";
    }

    @GetMapping("/institutions/delete")
    public String deleteInstitution(@RequestParam Long id){
        institutionsService.deleteInstitution(id);
        return "redirect:/institutions";
    }

    @GetMapping("/institutions/update")
    public String updateInstitution(@RequestParam Institutions institution){
        institutionsService.updateInstitution(institution);
        return "redirect:/institutions";
    }


}
