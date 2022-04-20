package pl.konstanty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vetsg")
public class VetController {

    @GetMapping
    String listVets(){
        return "vets/index";
    }
}
