package com.example.BetrayalAtBaldursGate.controllers;

import com.example.BetrayalAtBaldursGate.cards.EventCard;
import com.example.BetrayalAtBaldursGate.repositories.EventCardRepository;
import com.example.BetrayalAtBaldursGate.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventCardController {

    @Autowired
    EventCardRepository eventCardRepository;

    @Autowired
    CardService cardService;

    @GetMapping(value = "/event_cards")
    public ResponseEntity<List<EventCard>> getAllEventCards() {
        return new ResponseEntity<>(eventCardRepository.findAll(), HttpStatus.OK);
    }

//    @GetMapping(value = "/cards")
//    public ResponseEntity<List<Card>> getAllCards(){
//        return new ResponseEntity<>(cardService.generateACard(), HttpStatus.OK);
//    }
}
