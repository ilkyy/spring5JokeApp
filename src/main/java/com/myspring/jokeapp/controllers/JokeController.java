package com.myspring.jokeapp.controllers;

import com.myspring.jokeapp.services.JokeServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeServices jokeServices;

    public JokeController(JokeServices jokeServices) {
        this.jokeServices = jokeServices;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokeServices.getJoke());

        return "chuckNorrisView";
    }
}
