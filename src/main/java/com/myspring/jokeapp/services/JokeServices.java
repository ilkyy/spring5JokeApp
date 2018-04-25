package com.myspring.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServices {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServices() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
