package com.example.BetrayalAtBaldursGate.tiles;

import com.example.BetrayalAtBaldursGate.characters.Hero;

public enum Door {

    CURSED_STATUE ("Cursed Statue"),
    TRASH_PILE ("Trash Pile"),
    SHRINE_TO_GARGAUTH ("Shrine To Gargauth"),
    BELOVED_RANGER_STATUE ("Beloved Ranger Statue"),
    WEAPON_SHOP ("Weapon Shop"),
    HALL_OF_WONDERS ("Hall of Wonders"),
    MURDER_ROW ("Murder Row"),
    SMITHY ("Smithy"),
    STOREHOUSE ("Storehouse"),
    MARKETPLACE ("Marketplace"),
    HOUSE_OF_BLOOD ("House of Blood"),
    MANSION ("Mansion"),
    FOUNTAIN ("Fountain"),
    KITCHEN ("Kitchen"),
    INNER_CHAMBER ("Inner Chamber"),
    ELFSONG_TAVERN ("Elfsong Tavern"),
    GRAY_HARBOUR ("Gray Harbour"),
    TRADING_POST ("Trading Post"),
    EXECUTIONERS_BLOCK ("Executioner's Block"),
    FELOGYRS_FIREWORKS ("Felogyr's Fireworks"),
    SPYS_ROOST ("Spy's Roost"),
    HAUNTED_ALLEY ("Haunted Alley"),
    DEAD_END("Dead End"),
    SORCEROUS_SUNDRIES ("Sorcerous Sundries"),
    TEMPLE_OF_UMBERLEE ("Temple of Umberlee"),
    ROSE_PORTAL ("Rose Portal"),
    WATERFRONT ("Waterfront"),
    FALSE ("False");

    private final String name;

    Door(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
