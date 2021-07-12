package com.example.BetrayalAtBaldursGate.services;

import com.example.BetrayalAtBaldursGate.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GameService {

    @Autowired
    BuildingTileRepository buildingCardRepository;

    @Autowired
    StreetTileRepository streetTileRepository;

    @Autowired
    OmenCardRepository omenCardRepository;

    @Autowired
    ItemCardRepository itemCardRepository;

    @Autowired
    HeroRepository heroRepository;

    @Autowired
    MonsterRepository monsterRepository;

//
//    public String moveHero(Integer direction, StandardGame game) {
//        String currentTile = game.getHero().getTile().getName();
//        if(direction != null){
//            game.getHero().move(game, direction);
//            game.getBuildingTiles().forEach(buildingTile -> {if (buildingTile == game.getHero().getTile()){
//                buildingTile.addHero(game.getHero());
//            }});
//            game.getStreetTiles().forEach(streetTile -> {if (streetTile == game.getHero().getTile()){
//                streetTile.addHero(game.getHero());
//            }});
//            if(currentTile.equals(game.getHero().getTile().getName())){
//                return "You cannot move in that direction from " + currentTile;
//            }
//            return "You moved from " + currentTile + " to " + game.getHero().getTile().getName();
//
//        } else {
//            return "You didn't submit a direction to move";
//        }
//    }
}
