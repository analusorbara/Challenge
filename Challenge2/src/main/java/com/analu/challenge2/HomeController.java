package com.analu.challenge2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping(value = {"/", "/index"})
    public String index(Model model) {

        Information info= new Information();

        model.addAttribute("title", " Trustly - Challenge 2");
        model.addAttribute("name", info.getName());
        model.addAttribute("nationality", info.getNationality());
        model.addAttribute("bigDream",info.getBigDream());
        return "index";
    }
}
