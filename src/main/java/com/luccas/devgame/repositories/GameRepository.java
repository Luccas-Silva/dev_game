package com.luccas.devgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luccas.devgame.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
