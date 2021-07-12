package com.example.BetrayalAtBaldursGate.services;

import com.example.BetrayalAtBaldursGate.repositories.HeroRepository;
import com.example.BetrayalAtBaldursGate.repositories.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttackService {

    @Autowired
    HeroRepository heroRepository;

    @Autowired
    MonsterRepository monsterRepository;

}
