package com.dmarqss.quizGeekFest.controlers;

import com.dmarqss.quizGeekFest.models.Question;
import com.dmarqss.quizGeekFest.services.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "questions")
public class QuestionsController {

    @Autowired
    QuestionsService questionsService;

    @GetMapping(path = "amount")
    public ResponseEntity<?> getQuestionsAmount(){
        return new ResponseEntity<>(questionsService.questionAmount(), HttpStatus.OK);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<?> getQuestionById(@PathVariable("id") int id){
        Question question = questionsService.findById(id);
        return new ResponseEntity<>(question,HttpStatus.OK);
    }
}
