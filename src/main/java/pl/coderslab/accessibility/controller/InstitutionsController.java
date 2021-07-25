package pl.coderslab.accessibility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.accessibility.model.Institutions;
import pl.coderslab.accessibility.service.InstitutionsService;

@Controller
public class InstitutionsController {

    private final InstitutionsService institutionsService;

    @Autowired
    public InstitutionsController(InstitutionsService institutionsService) {
        this.institutionsService = institutionsService;
    }

    @GetMapping(value = "/addInstitution")
    public String addInstitutionShow(Model model){
        model.addAttribute("institution", new Institutions());
        return "addInstitution";
    }

    @PostMapping(value = "/addInstitution")
    public String addInstitutionPerform(@RequestParam String name,
                                 @RequestParam String address,
                                 @RequestParam String website,
                                 @RequestParam String phoneNumber,
                                 Model model){
        Institutions institution = new Institutions();
        institution.setName(name);
        institution.setAddress(address);
        institution.setWebsite(website);
        institution.setPhoneNumber(phoneNumber);
        institutionsService.addInstitution(institution);
        return "successAddInstitution";
    }

}
