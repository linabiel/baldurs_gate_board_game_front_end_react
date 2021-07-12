package com.example.BetrayalAtBaldursGate.repositories;

import com.example.BetrayalAtBaldursGate.cards.ItemCard;
import com.example.BetrayalAtBaldursGate.tiles.BuildingTile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemCardRepository extends JpaRepository<ItemCard, Long> {
}
