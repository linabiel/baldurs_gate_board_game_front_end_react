package com.example.BetrayalAtBaldursGate.components;

import com.example.BetrayalAtBaldursGate.cards.OmenCard;
import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.cards.EventCard;

import com.example.BetrayalAtBaldursGate.characters.Monster;
import com.example.BetrayalAtBaldursGate.repositories.*;
import com.example.BetrayalAtBaldursGate.tiles.BuildingTile;
import com.example.BetrayalAtBaldursGate.tiles.Door;
import com.example.BetrayalAtBaldursGate.tiles.Icon;
import com.example.BetrayalAtBaldursGate.tiles.StreetTile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MonsterRepository monsterRepository;


    @Autowired
    HeroRepository heroRepository;

    @Autowired
    EventCardRepository eventCardRepository;

    @Autowired
    ItemCardRepository itemCardRepository;

    @Autowired
    OmenCardRepository omenCardRepository;

    @Autowired
    BuildingTileRepository buildingTileRepository;

    @Autowired
    StreetTileRepository streetTileRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Hero azadeh = new Hero("Azadeh Rashka", 3, 4, 5, 3, "Human", 7, 8, 8, 5, "image", "Monk", 42);
        heroRepository.save(azadeh);

        Hero dhadius = new Hero("Dhadius The Scarlet", 2, 4, 4, 5, "Human", 6, 8, 8, 7, "image", "Wizard", 55);
        heroRepository.save(dhadius);

        Hero gretchen = new Hero("Gretchen Titchwillow", 4, 4, 4, 3, "Halfling", 8, 8, 6, 8, "image", "Druid", 112);
        heroRepository.save(gretchen);

        Hero grim = new Hero("'Grim' Grusk Mugtug", 4, 3, 4, 4, "Half-Ord", 6, 7, 8, 4, "image", "Paladin", 60);
        heroRepository.save(grim);

        Hero lia = new Hero("Lia Faen Tlabbar", 2, 3, 6, 4, "Drow", 7, 7, 8, 8, "image", "Warlock", 254);
        heroRepository.save(lia);

        Hero torskar = new Hero("Torskar Stonecleaver", 5, 4, 3, 3, "Dwarf", 8, 6, 7, 6, "image", "Barbarian", 130);
        heroRepository.save(torskar);

        StreetTile cursedStatue = new StreetTile("Cursed Statue", Door.FALSE, Door.FALSE, Door.WEAPON_SHOP, Door.FALSE, Icon.OMEN);
        streetTileRepository.save(cursedStatue);

        StreetTile trashPile = new StreetTile("Trash Pile", Door.FALSE, Door.FALSE, Door.STOREHOUSE, Door.FALSE, Icon.EVENT);
        streetTileRepository.save(trashPile);

        BuildingTile shrineToGargauth = new BuildingTile("Shrine To Gargauth", Door.FALSE, Door.BELOVED_RANGER_STATUE, Door.MARKETPLACE, Door.FALSE, Icon.OMEN);
        buildingTileRepository.save(shrineToGargauth);

        StreetTile belovedRangerStatue = new StreetTile("Beloved Ranger Statue", Door.FALSE, Door.FALSE, Door.FALSE, Door.SHRINE_TO_GARGAUTH, Icon.FALSE);
        streetTileRepository.save(belovedRangerStatue);

        BuildingTile weaponShop = new BuildingTile("Weapon Shop", Door.CURSED_STATUE, Door.HALL_OF_WONDERS, Door.FALSE, Door.FALSE, Icon.ITEM);
        buildingTileRepository.save(weaponShop);

        BuildingTile hallOfWonders = new BuildingTile("Hall of Wonders", Door.FALSE, Door.FALSE, Door.HOUSE_OF_BLOOD, Door.WEAPON_SHOP, Icon.EVENT);
        buildingTileRepository.save(hallOfWonders);

        StreetTile murderRow = new StreetTile("Murder Row", Door.FALSE, Door.SMITHY, Door.FOUNTAIN, Door.FALSE, Icon.OMEN);
        streetTileRepository.save(murderRow);

        BuildingTile smithy = new BuildingTile("Smithy", Door.FALSE, Door.STOREHOUSE, Door.FALSE, Door.MURDER_ROW, Icon.EVENT);
        buildingTileRepository.save(smithy);

        BuildingTile storehouse = new BuildingTile("Storehouse", Door.TRASH_PILE, Door.MARKETPLACE, Door.INNER_CHAMBER, Door.SMITHY, Icon.ITEM);
        buildingTileRepository.save(storehouse);

        StreetTile marketplace = new StreetTile("Marketplace", Door.SHRINE_TO_GARGAUTH, Door.FALSE, Door.ELFSONG_TAVERN, Door.FALSE, Icon.ITEM);
        streetTileRepository.save(marketplace);

        BuildingTile houseOfBlood = new BuildingTile("House of Blood", Door.HALL_OF_WONDERS, Door.MANSION, Door.FALSE, Door.FALSE, Icon.OMEN);
        buildingTileRepository.save(houseOfBlood);

        BuildingTile mansion = new BuildingTile("Mansion", Door.FALSE, Door.FOUNTAIN, Door.FALSE, Door.HOUSE_OF_BLOOD, Icon.EVENT);
        buildingTileRepository.save(mansion);

        StreetTile fountain = new StreetTile("Fountain", Door.MURDER_ROW, Door.KITCHEN, Door.EXECUTIONERS_BLOCK, Door.MANSION, Icon.FALSE);
        streetTileRepository.save(fountain);

        BuildingTile kitchen = new BuildingTile("Kitchen", Door.FALSE, Door.INNER_CHAMBER, Door.FELOGYRS_FIREWORKS, Door.FOUNTAIN, Icon.FALSE);
        buildingTileRepository.save(kitchen);

        BuildingTile innerChamber = new BuildingTile("Inner Chamber", Door.STOREHOUSE, Door.ELFSONG_TAVERN, Door.SPYS_ROOST, Door.KITCHEN, Icon.FALSE);
        buildingTileRepository.save(innerChamber);

        BuildingTile elfsongTavern = new BuildingTile("Elfsong Tavern", Door.MARKETPLACE, Door.GRAY_HARBOUR, Door.HAUNTED_ALLEY, Door.INNER_CHAMBER, Icon.FALSE);
        buildingTileRepository.save(elfsongTavern);

        StreetTile grayHarbor = new StreetTile("Gray Harbour", Door.FALSE, Door.FALSE, Door.FALSE, Door.ELFSONG_TAVERN, Icon.EVENT);
        streetTileRepository.save(grayHarbor);

        BuildingTile tradingPost = new BuildingTile("Trading Post", Door.FALSE, Door.EXECUTIONERS_BLOCK, Door.FALSE, Door.FALSE, Icon.EVENT);
        buildingTileRepository.save(tradingPost);

        StreetTile executionersBlock = new StreetTile("Executioner's Block", Door.FOUNTAIN, Door.FELOGYRS_FIREWORKS, Door.DEAD_END, Door.TRADING_POST, Icon.OMEN);
        streetTileRepository.save(executionersBlock);

        BuildingTile felogyrsFireworks = new BuildingTile("Felogyr's Fireworks", Door.KITCHEN, Door.FALSE, Door.SORCEROUS_SUNDRIES, Door.EXECUTIONERS_BLOCK, Icon.EVENT);
        buildingTileRepository.save(felogyrsFireworks);

        BuildingTile spysRoost = new BuildingTile("Spy's Roost", Door.INNER_CHAMBER, Door.FALSE, Door.FALSE, Door.FALSE, Icon.EVENT);
        buildingTileRepository.save(spysRoost);

        StreetTile hauntedAlley = new StreetTile("Haunted Alley", Door.ELFSONG_TAVERN, Door.FALSE, Door.ROSE_PORTAL, Door.FALSE, Icon.OMEN);
        streetTileRepository.save(hauntedAlley);

        StreetTile deadEnd = new StreetTile("Dead End", Door.EXECUTIONERS_BLOCK, Door.FALSE, Door.FALSE, Door.FALSE, Icon.EVENT);
        streetTileRepository.save(deadEnd);

        BuildingTile sorcerousSundries = new BuildingTile("Sorcerous Sundries", Door.FELOGYRS_FIREWORKS, Door.TEMPLE_OF_UMBERLEE, Door.FALSE, Door.FALSE, Icon.EVENT);
        buildingTileRepository.save(sorcerousSundries);

        BuildingTile templeOfUmberlee = new BuildingTile("Temple of Umberlee", Door.FALSE, Door.ROSE_PORTAL, Door.FALSE, Door.SORCEROUS_SUNDRIES, Icon.ITEM);
        buildingTileRepository.save(templeOfUmberlee);

        StreetTile rosePortal = new StreetTile("Rose Portal", Door.HAUNTED_ALLEY, Door.WATERFRONT, Door.FALSE, Door.TEMPLE_OF_UMBERLEE, Icon.EVENT);
        streetTileRepository.save(rosePortal);

        StreetTile waterfront = new StreetTile("Waterfront", Door.FALSE, Door.FALSE, Door.FALSE, Door.ROSE_PORTAL, Icon.EVENT);
        streetTileRepository.save(waterfront);

//        BuildingTile warehouse = new BuildingTile("Warehouse", Door.FALSE, Door.FALSE, Door.FALSE, Door.FALSE, Icon.ITEM);
//        buildingTileRepository.save(warehouse);

//        StreetTile ambushAlley = new StreetTile("Ambush Alley", Door.FALSE, Door.FALSE, Door.FALSE, Door.FALSE, Icon.EVENT);
//        streetTileRepository.save(ambushAlley);


//        StreetTile watchPost = new StreetTile("Watch Post", Door.FALSE, Door.FALSE, Door.FALSE, Door.FALSE, Icon.EVENT);
//        streetTileRepository.save(watchPost);

        Monster intelDevour = new Monster("Intellect Devourer",3,3,0,5,"Intellect Devourer", "url");
        monsterRepository.save(intelDevour);


        EventCard aFlumphAppears = new EventCard("The strangest thing you've ever seen - a jellyfish with eyes - floats out of the corner, gesturing emphatically with its barbed tentacles", "A Flumph Appears", "You must attempt a knowledge roll: 4+ You discover a hidden treasure cache. Draw an item card, 2-3: You discover a hollow filled with spiders that swarm up your arm. Lose 1 Might. 0-1 You find a Kobold catacomb title( or the Catacomb landing if the Kobold hideout isn't in play yet) Take 1 die of Physical damage.");
        eventCardRepository.save(aFlumphAppears);

        EventCard aHagsBlessing = new EventCard("A stooped figure clad in a tattered robe stumbles toward you. She studies you with milky cataract-filled eyes before pointing at you and speaking", "A Hag's Blessing", "Roll 2 dice: 4: She whispers forbidden love. Gain 1 Knowledge, 3: She offers a spell of protection gain 1 Sanity. 3: She mutters incoherently before shuffling on. 1: She promises death and ruin, lose 1 Sanity. 0: She curses you. The next time you would roll for anything except for the haunt treat the results as 0");
        eventCardRepository.save(aHagsBlessing);

        EventCard arcaneGate = new EventCard("A portal springs to life here, offering a shimmering passage to another location", "Arcane Gate", "Place 1 square Arcane Gate token on this tile, and the second square Arcane Gate token on any other tile on the board. An adventure, monster or NPC can move between those tiles with 1 space of movement");
        eventCardRepository.save(arcaneGate);

        EventCard bhallsCall = new EventCard("You have a vision of a grotesque skull, or blood pools around your feet and your ears", "Bhaal's Call", "You must attempt a Sanity roll: 4+ You find the vision oddly compelling, Gain 1 Might. 2-3: Lose 1 Sanity. 0-1: Your mind is attacked. If your mind is attacked, the player on your right rolls a Sanity 3 attacked against you. You dont roll defence. Instead, if the result is higher than your Sanity, you take Mental damage equal to the difference between the two");
        eventCardRepository.save(bhallsCall);

        EventCard craniumRats = new EventCard("A horde of rats emerge from their burrows to surround you. Their overgrown, pulsating brains extrude from their skulls. Theireyes glow red and you feel their minds link in an overwhelming force that reaches into your brains to root through your memories ", "Cranium Rats", "You must attempt a Sanity roll: 4+ You overwhelm the rats and loot their minds gain 1 Sanity. 2-3 They find what they were looking for. Lose 1 Knowledge. 0-1 you were unprepared for the assault. Take 1 die of Mental damage.  ");
        eventCardRepository.save(craniumRats);

        EventCard crawlingClaw = new EventCard("A severed hand drops from above and grabs your neck. You grasp and wheeze as it crushes your throat in an iron grip", "Crawling Claw", "You must attempt a Might roll: 4+ You tear the crawling claw from your throat. 0-3 You cant get the crawling claw off. Keep this card. Take 1 point of physical damage at the end of each of your turns. Discard this card the next time you increase any traits or if you end your turn on the Weapon Shop building tile or following catacomb tiles, Assassin's Run, Beast's Lair, Gladiators Pit, Kitchen Basement or Weapon Ship basement. ");
        eventCardRepository.save(crawlingClaw);

        EventCard deathVision = new EventCard("A huge horde of bugs gather in a pile. They flee as you approach, revealing your own half-eaten corpse", "Death Vision", "You must attempt a Sanity Roll. 4+ It was just a horrible vision. Gain 1 Sanity. 2-3 The image disturbs you. Lose 1 Sanity. 0-1 You scream as the buds swarm over you take 1 die of physical damage");
        eventCardRepository.save(deathVision);

        EventCard demonicPossession = new EventCard("You find an obsidian idol sticking out the ground. As you attempt to dislodge it, the demon trapped within tries to possess you", "Demonic Possession", "You must attempt a Sainty roll. Add 1 to the result if your adventurer is a drow. 6+ you overwhelm the demon. Gain 1 in a trait of your choice. 3-5 You battle to a draw. Nothing happens. 1-2 It takes a piece of your mind with it. Lose 1 Sanity. 0 You remember everything as the demon forces you to kill an innocent. Lose 2 Sanity");
        eventCardRepository.save(demonicPossession);

        EventCard desiccatedHeart = new EventCard("You find a shriveled ", "Demonic Possession", "You must attempt a Sainty roll. Add 1 to the result if your adventurer is a drow. 6+ you overwhelm the demon. Gain 1 in a trait of your choice. 3-5 You battle to a draw. Nothing happens. 1-2 It takes a piece of your mind with it. Lose 1 Sanity. 0 You remember everything as the demon forces you to kill an innocent. Lose 2 Sanity");
        eventCardRepository.save(desiccatedHeart);

        EventCard shamblingForm = new EventCard("A drunkard staggers toward you through the night. As the form draws near, you see to your horror that it is actually a bloated shambling zombie","Shambling Form","You must attempt a Speed roll: 4= You dodge the zombie, evading its reach just before it explodes in a burst of slime and pus. You find a useful item in the remains. Draw an item card. 2-3 You attempt to flee but are caught in the shower of gore as the zombie bursts. Lose 1 Speed. 0-1 The zombie grabs you and explodes messily. Lose 1 Might.");
        eventCardRepository.save(shamblingForm);

        EventCard soundOfLoomingDoom = new EventCard("You hear a low growl. Glowing red eyes pierce the darkness ahead. Out from the shadows glides a large yeth hound, but its face looks less like a dog's and more like yours.","Sound of Looming Doom","Each adventurer must attempt a Speed rool. If there is a tie for the highest or lowest, the tied adventurers roll again until there is no tie. The highest roller gains 1 Speed. The lowest roller is attacked by the yeth hound. The player to their right rolls a Speed 3 attack for the yeth hound. They defend with Speed.");
        eventCardRepository.save(soundOfLoomingDoom);

        EventCard stalkingShadow = new EventCard("Your shadow seems to flicker and dance, moving of its own accord as it coalesces into a horrid humanoid shape that lunges at you.", "Stalking Shadow", "You must attempt a Speed roll: 4+ You dodge the shadow and escape its clutches. 2-3 The shadow grabs you, and deadening cold flows through your lower body. Lose 1 Speed.");
        eventCardRepository.save(stalkingShadow);

        EventCard testOfTheDeadThree = new EventCard("Three spectral images appear before you: a sinister warrior clad in armour; a shriveled, skeletal mage in robes; and a sneering man who carries a bloody dagger. You sense they are here to test you.","Test of the Dead Three","You must attempt a sparate roll for each of Might, Speed, and Knowledge: 2+ That trait is unaffected. 0-1 Lose 1 from that trait. If you roll 2 or higher for all 3 rolls, gain 1 in one of those traits of your choice");
        eventCardRepository.save(testOfTheDeadThree);

        EventCard theGreenDevilFace = new EventCard("The green stone face of devilish countenance protrudes from the wall. Its mouth is agape and filled with utter darkness. The darkness beckons you.","The Green Devil Face","You reach into the darkness. Roll 4 dice: 5+ You find something inside! Draw an item card. 3-4 Nothing happens. 1-2 You are teleported away. Discard all item cards you control and place your adventurer on the Elfsong Tavern tile. Lose 1 Sanity as your clothes didn't come with you. 0 If the haunt hasn't begun, treat this roll as a 1. Otherwise, the sphere of annihilation within the darkness kills you. You die.");
        eventCardRepository.save(theGreenDevilFace);

        EventCard theStorm = new EventCard("It starts with a single flash, then another. Soon the night is lit by a thousand streaks of lightning.","The Storm" ,"Every adventurer on a street tile must immediately use their Speed to move onto the closest building tile if possible. Each of those advenuters then rolls dice equal to the total spaces they moved (maximum of 8 dice). If they couldn't move onto a building tile they roll 8 dice. 6+ Take 2 dice of physical damage. 4-5 Take 1 die of physical damage. 2-3 Take 1 point of physical damage. 0-1 You got lucky. This time.");
        eventCardRepository.save(theStorm);

        EventCard trapper = new EventCard("The wall here looks strange, as if covered with slime. When you step closer to investigate, it curls around you in a crushing grip.","Trapper","You must attempt a Might roll: 4+ You break free and slay the trapper with one mighty blow. Draw an item card. 1-3 You pull free from the trapper's grip and escape. Take 1 die of physical damage. 0 You are trapped! Take 1 die of physical damage and your turn ends. Keep this card in front of you. Repeat this Might roll at the start of your next turn, adding 1 die to the roll for each adventurer on your tile. Discard this card unless you roll 0 again.");
        eventCardRepository.save(trapper);

        EventCard troglodyteStench = new EventCard("This area is filled with a sickening stench. Your head swims and your limbs suddenly feel as if they are carved from lead.","Troglodyte Stench","Place the square Stench token on this tile and this card near it. Adventurers who make Might rolls on this tile roll 2 fewer dice(minimum of 1 die).");
        eventCardRepository.save(troglodyteStench);

        EventCard vampiricMist = new EventCard("Fog drifts towards you. A rat runs into it and you hear a loud squeak. As the fog wafts forward, you see the husk of the rodent.","Vampiric Mist","You must attempt a Knowledge roll: 4+ It's vampiric mist, get away! Gain 1 Speed. 0-3 It must only kill rats, you say to yourself as you walk through the fog. Take 1 point of physical damage.");
        eventCardRepository.save(vampiricMist);

        EventCard wereratBite = new EventCard("You look down and see a fat, horrid-looking rat scamper away as you notice the pain in your foot. You suddenly don't feel so well.", "Wererat Bite", "You have been infected with lycanthropy. Keep this card in front of you. Lose 1 Knowledge and 1 Sanity. Gain 1 Might and Speed. If you inflict physical damage to an adventurer on your tile with an attack, you may choose to also infect them with lycanthropy. If you do, they lose 1 Knowledge and 1 Sanity, and gain 1 Might and 1 Speed. They can then infect other adventurers using the same rules. Each adventurer can be infected with lycanthropy only once per game.");
        eventCardRepository.save(wereratBite);

        EventCard willOWisp = new EventCard("A flickering light appears in the gloom ahead. It bobs and weaves in the air, and you feel an overwhelming compulsion to follow it.", "Will-O'-Wisp", "You must attempt a Knowledge roll: 4+ You resist the urge to follow the light. Gain 1 Knowledge. 2-3 Remove your adventurer figure from the board. At the start of your next turn, place your figure on any revealed omen tile, or the Elfsong Tavern tile if there are no omen tiles. Take 1 die of physical damage. 0-1 You follow the will-o'wisp in circles. Place your adventurer figure on the Elfsong Tavern tile.");
        eventCardRepository.save(willOWisp);

        EventCard yellowMold = new EventCard("Clumps of sickly yellow mold grow here. Spores erupt from the mold, and a coughing fit overcomes you.", "Yellow Mold", "Place the square Yellow Mold token on this tile and this card near it. Any time an adventurer enters the tile, including when you draw this card, that adventurer must attempt a Might roll: 4+ Puny spores can't hurt you. 1-3 This cough is going to last a while. Lose 1 Might. 0 You double over in pain. Take 1 die of physical damage.");
        eventCardRepository.save(yellowMold);

        EventCard zhentarimOpportunist = new EventCard("A thug leaps from the shadows, brandishing a dagger. 'Give me what I want, and no one gets hurt,' he hisses at you.", "Zhentarim Opportunist", "You may discard an item card along with this card. If you don't, the thug attacks. The player to your right rolls a Might 4 attack for the thug. You defend with Might as normal. If you take any damage from the attack, the thug is emboldened by his succcess. Draw the top 3 cards from the event deck without looking at them. Add this card ot them, shuffle them and place them back on top of the event deck.");
        eventCardRepository.save(zhentarimOpportunist);



        OmenCard berserkerAxe = new OmenCard(
                "This axe was made to kill. It just needs you to help it fullfill its destiny",
                "Berserker Axe",
                "Your roll 2 additional dice (maximum of 8 dice) when making a Might attack with this weapon."
                        + "If you are on a tile with one or more opponents, you cannot leave that tile unless you " +
                        "first attack an opponent with this weapon." +
                        "You can't use another weapon while you're using this one." +
                        "This omen can't be dropped or traded, but it can be stolen.");
        omenCardRepository.save(berserkerAxe);

        OmenCard bookOfSpells = new OmenCard(
                "This dusty tome is filled with secrets - some useful, others dangerous",
                "Book of Spells",
                "If you " +
                        "attack an opponent that has a Sanity trait, you may attack with Sanity instead of Might (your " +
                        "opponent defends with Sanity, amd damage is mental instead of physical)." +
                        "If you attack an opponent in this way and you take damage, take 1 additional point of damage." +
                        "You can't use another weapon while you're using this one.");
        omenCardRepository.save(bookOfSpells);


        OmenCard cursedArmor = new OmenCard(
                "The armor makes you feel like you can stand up to anyone",
                "Cursed Armor",
                "Gain 1 Sanity." +
                        "Lose 1 Sanity if oyu lose control of the Cursed Armor." +
                        "Whenever you roll defence, you may add 1 to the result. If you do, lose 1 sanity." +
                        "This omen can't be stolen.");
        omenCardRepository.save(cursedArmor);


        OmenCard deckOfManyThings = new OmenCard(
                "What's the worst that could come of drawing a card?",
                "Deck of Many Things",
                "You may use this omen " +
                        "once during each of your to draw from the Deck of Many Things. Roll 4 dice and subtract 1 from the " +
                        "result for each small monster token on this card:" +
                        "8+ Moon:Gain 4 in a trait of your choice." +
                        "5-7 Star: Gain 1 in a trait of your choice." +
                        "3-4 Sun: Draw an item card." +
                        "1-2 Talons: Discard an item card or take 1 point of mental damage." +
                        "0 Void: Reduce one trait to its lowest value above the skull icon. If the haunt has begun, you die " +
                        "instead. " +
                        "After rolling, place 1 small monster token on this card. If this card is dropped, traded, " +
                        "or" +
                        " stolen, any small monster tokens stay on the card.");
        omenCardRepository.save(deckOfManyThings);

        OmenCard dimensionalShackles = new OmenCard(
                "The shackles immediately latch onto your legs",
                "Dimensional Shackles",
                "Lose 1 Speed." +
                        "Gain 1 Speed if you lose control of the Dimensional Shackles." +
                        "Whenever you make an attack against an adventurer on your tile and win, you may give the " +
                        "defender this card instead of inflicting damage." +
                        "This omen can't be dropped or stolen, but it can be given (as above). It can also be traded " +
                        "as long as both players agree.");
        omenCardRepository.save(dimensionalShackles);

        OmenCard whisperingSkull = new OmenCard("A small skull carved from jade. You hear vague, distant whispers as you look into it's empty eyes",
                "Whispering Skull",
                "Once during your turn after the haunt has begun, you mat move 1 small monster or NPC 1 space." +
                        "Make a haunt roll now.");
        omenCardRepository.save(whisperingSkull);

        OmenCard symbolOfBhaal = new OmenCard("This sinister holy symbol is covered in blood. You feel your temperature begin to rise as you handle it",
                "Symbol of Bhaal",
                "After the haunt begins, whenever an adventurer is killed, roll a die. " +
                        "2 the symbol pulses with power.Gain 1 Might. " +
                        "1 You feel...nothing. " +
                        "0 If you killed that adventurer, nothing happens." +
                        "Otherwise, take 1 die of mental damage." +
                        "Make a haunt roll now");
        omenCardRepository.save(symbolOfBhaal);

        OmenCard pipesOfHaunting = new OmenCard("The spellbinding tune created by this instrument causes those around to relive their worst fears",
                "Pipes of Haunting",
                "You may use this omen to play the pipes during your turn after the haunt" +
                        "If you do, each adventurer, small monster, and NPC within 2 tiles of you must attempt a Sanity 4+ roll" +
                        "If they do not have a Sanity trait, or they fail the roll, you may move them 1 space away from you if possible (they cannot discover a new tile with that movement)" +
                        "Make a haunt roll now.");
        omenCardRepository.save(pipesOfHaunting);

        OmenCard meenLock = new OmenCard("A strange, horrid fey creature lurks in the shadows, filling your mind with terror",
                "Meenlock",
                "Gain 2 Speed." +
                        "When you take physical damage, you must apply it as mental damage instead" +
                        "Lose 2 Speed if you loase control of the Meenlock" +
                        "This omen can't be dropped, traded, or stolen" +
                        "Make a haunt roll now");
        omenCardRepository.save(meenLock);

        OmenCard ironFlaskOfTuerney = new OmenCard("This iron flask shudders and quakes, as if something wants out",
                "Iron Flask of Tuerny",
                "Instead of attacking normally, you use this omen on your turn to open the flask, unleashing the balor trapped within" +
                        "The demon makes a Might 6 attack against every adventurer, monster, and NPC on your tile, including yourself, before returning to the Abyss" +
                        "This omen can be used only once per game" +
                        "Make a haunt roll now.");
        omenCardRepository.save(ironFlaskOfTuerney);

        OmenCard homonculus = new OmenCard("Companion: A pitiable, misshapen humanoid figure formed from clay, no more than a foot tall, emerges from the shadows and stares at you with black, unblinking eyes.",
                "Homunculus",
                "Gain 1 Might and 1 Knowledge" +
                        "Lose 1 Might and 1 Knowledge if you lose control of the Homunculus" +
                        "This omen can't be dropped, traded, or stolen" +
                        "Make a haunt roll now.");
        omenCardRepository.save(homonculus);

        OmenCard figurineOfWonder = new OmenCard("Companion: The small ebony statuette, shaped like a fly, fits in the palm of your hand",
                "Figurine of Wonderous Power",
                "The figurine transforms into a giant fly that stays with you and protects you.Once per game, when you take any amount of damage, you may ignore that damage instead." +
                        "This omen can't be dropped, traded, or stolen." +
                        "Make a haunt roll now.");
        omenCardRepository.save(figurineOfWonder);

        OmenCard eyeOfVecna = new OmenCard("Power at the cost of a single eye. A bargain to some, a curse to others",
                "Eye of Vecna",
                "Gain 1 Knowledge." +
                        "Lose 1 Knowledge if you lose control of the Eye of Vecna" +
                        "The Eye of Vecna grants you the power to inspire terror in others." +
                        "If an opponent attempts to move onto the tile you occupy, you may have them attempt a roll 2+ with 2 dice." +
                        "If they succeed, they enter your tile. If they fail, they stay on their current tile and end their movement for the turn." +
                        "If they failed and rolled a 1, you also take 1 of mental damage." +
                        "Make a haunt roll now");
        omenCardRepository.save(eyeOfVecna);

    }
}













