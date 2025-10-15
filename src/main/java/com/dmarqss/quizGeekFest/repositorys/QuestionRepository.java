package com.dmarqss.quizGeekFest.repositorys;

import com.dmarqss.quizGeekFest.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.security.PublicKey;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    public Question findById(int id);
}
