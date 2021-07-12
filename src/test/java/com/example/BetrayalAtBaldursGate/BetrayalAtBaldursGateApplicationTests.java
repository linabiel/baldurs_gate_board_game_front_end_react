package com.example.BetrayalAtBaldursGate;

import com.example.BetrayalAtBaldursGate.games.StandardGame;
import com.example.BetrayalAtBaldursGate.repositories.BuildingTileRepository;
import com.example.BetrayalAtBaldursGate.repositories.HeroRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BetrayalAtBaldursGateApplicationTests {

@Autowired
HeroRepository heroRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testBuildingRepository(){
		heroRepository.findAll();
	}

	@Test
	public void testCreateStandardGame(){
		StandardGame game = new StandardGame();
	}



}
