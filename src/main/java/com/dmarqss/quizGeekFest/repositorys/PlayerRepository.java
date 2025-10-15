package com.dmarqss.quizGeekFest.repositorys;

import com.dmarqss.quizGeekFest.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
