package com.example.BetrayalAtBaldursGate.characters;

import javax.persistence.*;


@MappedSuperclass
public abstract class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "might")
    private int might;

    @Column(name = "speed")
    private int speed;

    @Column(name = "sanity")
    private int sanity;

    @Column(name = "knowledge")
    private int knowledge;

    @Column(name = "race")
    private String race;

    @Column(name = "image")
    private String image;


    public Character(String name, int might, int speed, int sanity, int knowledge, String race, String image) {
        this.name = name;
        this.might = might;
        this.speed = speed;
        this.sanity = sanity;
        this.knowledge = knowledge;
        this.race = race;
        this.image = image;
    }

    public Character() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMight() {
        return might;
    }

    public void setMight(int might) {
        this.might = might;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSanity() {
        return sanity;
    }

    public void setSanity(int sanity) {
        this.sanity = sanity;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}

