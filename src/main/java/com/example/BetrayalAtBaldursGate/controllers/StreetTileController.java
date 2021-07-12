package com.example.BetrayalAtBaldursGate.controllers;

import com.example.BetrayalAtBaldursGate.repositories.StreetTileRepository;
import com.example.BetrayalAtBaldursGate.tiles.StreetTile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StreetTileController {


    @Autowired
    StreetTileRepository streetTileRepository;


    @GetMapping(value = "/street_tiles")
    public ResponseEntity<List<StreetTile>> getAllStreetTiles(){
        return new ResponseEntity<>(streetTileRepository.findAll(), HttpStatus.OK);
    }
}
