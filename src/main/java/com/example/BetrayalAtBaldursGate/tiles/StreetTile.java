package com.example.BetrayalAtBaldursGate.tiles;
import javax.persistence.*;

@Entity
@Table(name = "street_tiles")
public class StreetTile extends Tile{

    public StreetTile(String name, Door northDoor, Door eastDoor, Door southDoor, Door westDoor, Icon icon) {
        super(name, northDoor, eastDoor, southDoor, westDoor, icon);
    }

    public StreetTile(){

    }
}
