package com.example.MVClearning.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("processFormVersionTwo")
    public String shoutName(HttpServletRequest request, Model model) {

        String name = request.getParameter("studentName");

        name = "hello " +name.toUpperCase();

        model.addAttribute("message", name);

        return "helloworld";
    }

    @GetMapping("processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {

        name = "version 3 " +name.toUpperCase();

        model.addAttribute("message", name);

        return "helloworld";
    }
}
