package com.dmarqss.quizGeekFest.services;

import com.dmarqss.quizGeekFest.models.Player;
import com.dmarqss.quizGeekFest.models.PlayerDto;
import com.dmarqss.quizGeekFest.repositorys.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public void createPlayer(PlayerDto data){
        playerRepository.save(new Player(data.name(), data.score()));
    }
}
