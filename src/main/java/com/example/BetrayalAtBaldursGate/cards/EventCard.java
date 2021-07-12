package com.example.BetrayalAtBaldursGate.cards;
import javax.persistence.*;

@Entity
@Table(name = "event_cards")
public class EventCard extends Card{

    public EventCard(String flavourText, String name, String functionText) {
        super(flavourText, name, functionText);
    }

    public EventCard() {
    }
}
