package com.example.BetrayalAtBaldursGate.cards;

import javax.persistence.*;

@MappedSuperclass
public abstract class Card {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "flavour_text", length = 750)
    private String flavourText;

    @Column(name = "name")
    private String name;

    @Column(name = "function_text", length = 750)
    private String functionText;


    public Card(String flavourText, String name, String functionText) {
        this.flavourText = flavourText;
        this.name = name;
        this.functionText = functionText;

    }

    public Card() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlavourText() {
        return flavourText;
    }

    public void setFlavourText(String flavourText) {
        this.flavourText = flavourText;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getFunctionText() {
        return functionText;
    }

    public void setFunctionText(String functionText) {
        this.functionText = functionText;
    }


}
