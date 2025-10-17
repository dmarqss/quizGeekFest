package com.dmarqss.quizGeekFest.repositorys;

import com.dmarqss.quizGeekFest.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findTop10ByOrderByScoreDesc();

}
