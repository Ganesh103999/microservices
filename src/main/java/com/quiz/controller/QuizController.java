package com.quiz.controller;

import com.quiz.QuizServiceApplication;
import com.quiz.entity.Quiz;
import com.quiz.services.QuizService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping()
    public Quiz create(@RequestBody Quiz quiz ) {
        return quizService.add(quiz);
    }

    @GetMapping
    public List<Quiz> get(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz getById(@PathVariable Long id){
        return quizService.get(id);
    }



}
