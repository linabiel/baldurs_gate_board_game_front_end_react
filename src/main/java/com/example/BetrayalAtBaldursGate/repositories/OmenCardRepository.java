package com.example.BetrayalAtBaldursGate.repositories;

import com.example.BetrayalAtBaldursGate.cards.OmenCard;
import com.example.BetrayalAtBaldursGate.tiles.BuildingTile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OmenCardRepository extends JpaRepository<OmenCard, Long> {
}
