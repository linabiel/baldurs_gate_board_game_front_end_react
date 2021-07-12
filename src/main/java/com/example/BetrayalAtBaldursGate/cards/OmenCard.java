package com.example.BetrayalAtBaldursGate.cards;
import javax.persistence.*;


@Entity
@Table(name = "omen_cards")
public class OmenCard extends Card{

    public OmenCard(String flavourText, String name, String functionText) {
        super(flavourText, name, functionText);
    }

    public OmenCard() {
    }

    public void hauntRoll(){

    }
}