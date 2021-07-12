package com.example.BetrayalAtBaldursGate.controllers;

import com.example.BetrayalAtBaldursGate.games.StandardGame;
import com.example.BetrayalAtBaldursGate.repositories.*;
import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.services.GameService;
import com.example.BetrayalAtBaldursGate.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Transient;
import java.util.List;

@RestController
public class HeroController {

    @Autowired
    HeroService heroService;

    @Autowired
    HeroRepository heroRepository;

    @Autowired
    MonsterRepository monsterRepository;

    @Autowired
    BuildingTileRepository buildingTileRepository;

    @Autowired
    StreetTileRepository streetTileRepository;

    @Autowired
    OmenCardRepository omenCardRepository;

    @Autowired
    EventCardRepository eventCardRepository;

    @Autowired
    GameService gameService;

    @Transient
    StandardGame game = new StandardGame();


    @GetMapping(value = "/heroes")
    public ResponseEntity<List<Hero>> getAllHeroes() {
        return new ResponseEntity<>(heroRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/scroll")
    public String scrollMessage(){
        return heroService.displayMessage();
    }

    @GetMapping(value = "/start")
    public ResponseEntity<String> startGame() {
        Hero hero = heroRepository.findAll().get(0);
        game.setHero(hero);
        monsterRepository.findAll().forEach(monster -> game.getMonsters().add(monster));
        buildingTileRepository.findAll().forEach(buildingTile -> game.getBuildingTiles().add(buildingTile));
        streetTileRepository.findAll().forEach(streetTile -> game.getStreetTiles().add(streetTile));
        omenCardRepository.findAll().forEach(omenCard -> game.getOmenCards().add(omenCard));
        eventCardRepository.findAll().forEach(eventCard -> game.getEventCards().add(eventCard));
        game.getBuildingTiles().forEach(buildingTile -> {
            if (buildingTile.getName().equals("Elfsong Tavern")) {
                buildingTile.addHero(game.getHero());
                game.getHero().setTile(buildingTile);
            }
        });
        return new ResponseEntity("Random string7", HttpStatus.OK);
    }

    @GetMapping(value = "/move/{direction}")
    public ResponseEntity<String> moveHeroes(@PathVariable Integer direction) {

        String currentTile = game.getHero().getTile().getName();
        if (direction != null) {
            game.getHero().move(game, direction);
            game.getBuildingTiles().forEach(buildingTile -> {
                if (buildingTile == game.getHero().getTile()) {
                    buildingTile.addHero(game.getHero());
                }
            });
            game.getStreetTiles().forEach(streetTile -> {
                if (streetTile == game.getHero().getTile()) {
                    streetTile.addHero(game.getHero());
                }
            });
            if (currentTile.equals(game.getHero().getTile().getName())) {
                return new ResponseEntity<>("You cannot move in that direction from " + currentTile, HttpStatus.OK);
            }
            return new ResponseEntity<>("You moved from " + currentTile + " to " + game.getHero().getTile().getName()
                    , HttpStatus.OK);
        } else {
            return new ResponseEntity<>("You didn't submit a direction to move", HttpStatus.OK);
        }

    }


}