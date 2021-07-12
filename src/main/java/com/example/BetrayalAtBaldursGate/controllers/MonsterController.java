package com.example.BetrayalAtBaldursGate.controllers;

import com.example.BetrayalAtBaldursGate.characters.Monster;
import com.example.BetrayalAtBaldursGate.repositories.MonsterRepository;
import com.example.BetrayalAtBaldursGate.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonsterController {

    @Autowired
    MonsterRepository monsterRepository;

    @Autowired
    CardService cardService;


    @GetMapping(value = "/monsters")
    public ResponseEntity<List<Monster>> getAllMonsters(){
        return new ResponseEntity<>(cardService.getMonsters(), HttpStatus.OK);
    }
}