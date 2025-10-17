package com.dmarqss.quizGeekFest.controlers;

import com.dmarqss.quizGeekFest.models.PlayerDto;
import com.dmarqss.quizGeekFest.services.PlayerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "scoreboard")
public class ScoreboardController {
    @Autowired
    PlayerService playerService;

    @GetMapping
    public ResponseEntity<?> showScoreboard(){
        return new ResponseEntity<>(playerService.showTopTenRank(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createPlayer(@Valid @RequestBody PlayerDto data){
        playerService.createPlayer(data);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
