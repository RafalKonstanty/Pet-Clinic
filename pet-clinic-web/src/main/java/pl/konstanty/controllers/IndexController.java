package pl.konstanty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// If we want automatically reload content thanks to the Spring-boot devtools we need to adjust registry settings
// double-tap left shift, type 'registry' -> 'compiler.automake.allow.when.app.running' and check it.
// since Intellij 2021 -> its moved to File -> Settings -> Advanced Settings -> Compiler allow-automake to start even if the developed application is still running
// (alt+ctrl+s) Next Preferences -> Build execution Deployment -> Compiler -> Build project automatically
@Controller
@RequestMapping({"", "/", "index", "index.html"})
public class IndexController {

    @GetMapping
    String indexView() {
        return "index";
    }
}
