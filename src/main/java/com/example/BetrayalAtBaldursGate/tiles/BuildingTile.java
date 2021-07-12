package com.example.BetrayalAtBaldursGate.tiles;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "building_tiles" )
public class BuildingTile extends Tile{

    public BuildingTile(String name, Door northDoor, Door eastDoor, Door southDoor, Door westDoor, Icon icon) {
        super(name, northDoor, eastDoor, southDoor, westDoor, icon);
    }

    public BuildingTile() {
    }
}
