package com.luccas.devgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luccas.devgame.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
