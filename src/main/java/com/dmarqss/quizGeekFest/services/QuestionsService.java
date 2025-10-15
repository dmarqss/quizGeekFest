package com.dmarqss.quizGeekFest.services;

import com.dmarqss.quizGeekFest.models.Question;
import com.dmarqss.quizGeekFest.repositorys.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionsService {
    @Autowired
    QuestionRepository questionRepository;

    public int questionAmount(){
        return questionRepository.findAll().size();
    }

    public Question findById(int id){
        return questionRepository.findById(id);
    }
}
