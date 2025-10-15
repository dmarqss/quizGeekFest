package com.dmarqss.quizGeekFest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Entity
@Table(name = "questions")
@Data
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false, unique = true)
    String question;

    @Column(nullable = false)
    String optionA;

    @Column(nullable = false)
    String optionB;

    @Column(nullable = false)
    String optionC;

    @Column(nullable = false)
    String optionD;

    @Column(nullable = false)
    char optionCorrect;

    public Question(String question, String optionA, String optionB, String optionC, String optionD, char optionCorrect) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.optionCorrect = optionCorrect;
    }
}
