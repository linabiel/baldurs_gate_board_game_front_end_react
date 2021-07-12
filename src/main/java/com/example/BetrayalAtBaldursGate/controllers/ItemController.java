package com.example.BetrayalAtBaldursGate.controllers;

import com.example.BetrayalAtBaldursGate.cards.ItemCard;
import com.example.BetrayalAtBaldursGate.repositories.ItemCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemCardRepository itemCardRepository;


    @GetMapping(value = "/item_cards")
    public ResponseEntity<List<ItemCard>> getAllItemCards(){
        return new ResponseEntity<>(itemCardRepository.findAll(), HttpStatus.OK);
    }
}