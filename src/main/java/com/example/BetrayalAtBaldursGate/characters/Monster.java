package com.example.BetrayalAtBaldursGate.characters;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "monsters")
public class Monster extends Character{


    public Monster(String name, int might, int speed, int sanity, int knowledge, String species, String image) {
        super(name, might, speed, sanity, knowledge, species, image);
    }

    public Monster(){

    }
}
