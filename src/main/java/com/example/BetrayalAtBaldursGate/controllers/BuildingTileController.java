package com.example.BetrayalAtBaldursGate.controllers;
import com.example.BetrayalAtBaldursGate.tiles.BuildingTile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.BetrayalAtBaldursGate.repositories.BuildingTileRepository;

import java.util.List;

@RestController
public class BuildingTileController {

    @Autowired
    BuildingTileRepository buildingTileRepository;


    @GetMapping(value = "/building_tiles")
    public ResponseEntity<List<BuildingTile>> getAllBuildingTiles(){
        return new ResponseEntity<>(buildingTileRepository.findAll(), HttpStatus.OK);
    }
}
