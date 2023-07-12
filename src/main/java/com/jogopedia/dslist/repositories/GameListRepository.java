package com.jogopedia.dslist.repositories;

import com.jogopedia.dslist.entities.Game;
import com.jogopedia.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
