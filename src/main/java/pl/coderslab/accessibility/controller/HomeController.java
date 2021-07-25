package pl.coderslab.accessibility.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "home";
    }

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }


    @GetMapping(value = "/user")
    public String user(){
        return "user";
    }

    @GetMapping(value = "/admin")
    public String admin(){
        return "admin";
    }


    @GetMapping(value = "/404")
    public String print404(){
        return "404";
    }
    @GetMapping(value = "/blank")
    public String blank(){
        return "blank";
    }

}
