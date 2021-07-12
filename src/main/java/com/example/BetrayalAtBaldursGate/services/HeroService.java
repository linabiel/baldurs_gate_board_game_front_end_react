package com.example.BetrayalAtBaldursGate.services;

import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {

    @Autowired
    HeroRepository heroRepository;

    public List<Hero> getAllHeroes() {
        return heroRepository.findAll();
    }

    public String displayMessage() {
        return "This is where the move information should display";
    }

    public String moveInADirection(int direction) {
        if (direction == 1) {
            return "you have moved left";
        } else if (direction == 2) {
            return "you have moved right";
        } else if (direction == 3) {
            return "you have moved up";
        } else if (direction == 4) {
            return "you have moved down";
        }
        return "wrong move banana!";
    }

}



