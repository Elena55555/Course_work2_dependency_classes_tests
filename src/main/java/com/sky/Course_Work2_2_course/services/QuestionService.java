package com.sky.Course_Work2_2_course.services;
import com.sky.Course_Work2_2_course.question.Question;
import java.util.Set;

public interface QuestionService {
    void add(String question, String answer);

    void remove(String question, String answer);

    Set <Question> getAll();

    Question getRandomQuestion();



}
