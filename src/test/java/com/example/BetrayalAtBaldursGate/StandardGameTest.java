package com.example.BetrayalAtBaldursGate;

import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.games.StandardGame;
import com.example.BetrayalAtBaldursGate.repositories.HeroRepository;
import com.example.BetrayalAtBaldursGate.tiles.StreetTile;
import com.example.BetrayalAtBaldursGate.tiles.BuildingTile;
import com.example.BetrayalAtBaldursGate.cards.OmenCard;
import com.example.BetrayalAtBaldursGate.cards.EventCard;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.Assert.assertEquals;
@SpringBootTest
public class StandardGameTest {


    private StandardGame gameOne;
    private Hero hero1;
    private StreetTile streetTile1;
    private BuildingTile buildingTile1;
    private OmenCard omenCard1;
    private EventCard eventCard1;


//    @Before
//    public void before(){
//        gameOne = new StandardGame();
//        hero1 = new Hero("Kieran", 3, 4, 4,2, "Human", 5, 5, 5, 5, "image");
//        streetTile1 = new StreetTile("Testy", Door.YELLOW, Door.FALSE, Door.RED, Door.FALSE, Icon.EVENT);
//        buildingTile1 = new BuildingTile("Test", Door.RED, Door.FALSE, Door.RED, Door.FALSE, Icon.EVENT);
//        omenCard1 = new OmenCard("Omen Text");
//        eventCard1 = new EventCard("Event Text");
//
//    }
//
//    @Test
//    public void roundCounterStartsAtZero(){
//        assertEquals(0, gameOne.getRoundCounter());
//    }
//
//
//    @Test
//    public void setRoundCounterValue(){
//        gameOne.setRoundCounter(2);
//        assertEquals(2, gameOne.getRoundCounter());
//    }
//
//
//    @Test
//    public void omenCounterStartsAtZero(){
//        assertEquals(0, gameOne.getOmenCounter());
//    }
//
//    @Test
//    public void setOmenCounterValue(){
//        gameOne.setOmenCounter(3);
//        assertEquals(3, gameOne.getOmenCounter());
//    }
//
//    @Test
//    public void playersArrayListStartAtZero(){
//        assertEquals(0, gameOne.getPlayers().size());
//    }
//
//    @Test
//    public void addPlayerToPlayersArrayList(){
//        gameOne.addPlayerToList(hero1);
//        assertEquals(1, gameOne.getPlayers().size());
//    }
//
//    @Test
//    public void streetTilesArrayListStartAtZero(){
//      assertEquals(0,gameOne.getStreetTiles().size());
//    }
//
//    @Test
//    public void addStreetTileToStreetTilesArrayList(){
//        gameOne.addStreetTileToList(streetTile1);
//        assertEquals(1,gameOne.getStreetTiles().size());
//    }
//
//    @Test
//    public void buildingTilesArrayListStartAtZero(){
//        assertEquals(0,gameOne.getBuildingTiles().size());
//    }
//
//    @Test
//    public void addBuildingTileToStreetTilesArrayList(){
//        gameOne.addBuildingTileToList(buildingTile1);
//        assertEquals(1,gameOne.getBuildingTiles().size());
//    }
//
//    @Test
//    public void eventCardArrayListStartAtZero(){
//        assertEquals(0,gameOne.getBuildingTiles().size());
//    }
//
//    @Test
//    public void addEventCardToEventCardArrayList(){
//        gameOne.addEventCardToList(eventCard1);
//        assertEquals(1,gameOne.getEventCards().size());
//    }
//    @Test
//    public void omenCardArrayListStartAtZero(){
//        assertEquals(0,gameOne.getOmenCards().size());
//    }
//
//    @Test
//    public void addOmenCardToOmenCardArrayList(){
//        gameOne.addOmenCardToList(omenCard1);
//        assertEquals(1,gameOne.getOmenCards().size());
//    }
//
@Autowired
HeroRepository heroRepository;
    @Test
    public void populateGame(){
        heroRepository.findAll();
//        gameOne = new StandardGame();
//        gameOne.populateGame();
    }
}
