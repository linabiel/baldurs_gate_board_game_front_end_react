package com.example.BetrayalAtBaldursGate.characters;
import com.example.BetrayalAtBaldursGate.games.GameState;
import com.example.BetrayalAtBaldursGate.tiles.Tile;

import javax.persistence.*;


@Entity
@Table(name = "heroes")
public class

Hero extends Character {

    @Column(name = "max_might")
    private int maxMight;

    @Column(name = "max_speed")
    private int maxSpeed;

    @Column(name = "max_sanity")
    private int maxSanity;

    @Column(name = "max_knowledge")
    private int maxKnowledge;

    @Column(name = "profession")
    private String profession;


    @Column(name = "age")
    private int age;

    @Transient
    private Tile tile;

    public Hero(String name, int might, int speed, int sanity, int knowledge, String race, int maxMight, int maxSpeed, int maxSanity, int maxKnowledge, String image, String profession, int age) {
        super(name, might, speed, sanity, knowledge, race, image);
        this.maxMight = maxMight;
        this.maxSpeed = maxSpeed;
        this.maxSanity = maxSanity;
        this.maxKnowledge = maxKnowledge;
        this.profession = profession;
        this.age = age;
        this.tile = null;
    }

    public Hero() {
    }

    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public int getMaxMight() {
        return maxMight;
    }

    public void setMaxMight(int maxMight) {
        this.maxMight = maxMight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSanity() {
        return maxSanity;
    }

    public void setMaxSanity(int maxSanity) {
        this.maxSanity = maxSanity;
    }

    public int getMaxKnowledge() {
        return maxKnowledge;
    }

    public void setMaxKnowledge(int maxKnowledge) {
        this.maxKnowledge = maxKnowledge;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Tile move(GameState game, Integer direction) {
        String intendedTile = null;
        if (direction == 1){
            if (this.tile.getWestDoor().getName() == "False"){
                intendedTile = this.getTile().getName();
            } else {
                intendedTile = this.tile.getWestDoor().getName();
            };
        } else if(direction == 2){
            if (this.tile.getEastDoor().getName() == "False"){
                intendedTile = this.getTile().getName();
            } else {
                intendedTile = this.tile.getEastDoor().getName();
            };
        } else if (direction == 3){
            if (this.tile.getNorthDoor().getName() == "False"){
                intendedTile = this.getTile().getName();
            } else {
                intendedTile = this.tile.getNorthDoor().getName();
            };
        } else if (direction == 4){
            if (this.tile.getSouthDoor().getName() == "False"){
                intendedTile = this.getTile().getName();
            } else {
                intendedTile = this.tile.getSouthDoor().getName();
            };
        };

        String finalIntendedTile = intendedTile;
        game.getBuildingTiles().forEach(buildingTile -> {
            if (buildingTile.getName().equals(finalIntendedTile)){
                this.setTile(buildingTile);
            }
        });
        game.getStreetTiles().forEach(streetTile -> {
            if (streetTile.getName().equals(finalIntendedTile)){
                this.setTile(streetTile);
            }
        });
        return this.getTile();
    }
}
