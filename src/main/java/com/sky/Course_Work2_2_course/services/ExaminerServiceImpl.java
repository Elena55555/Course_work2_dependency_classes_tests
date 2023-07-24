package com.sky.Course_Work2_2_course.services;

import com.sky.Course_Work2_2_course.exceptions.NumberOfQuestionsExceededException;
import com.sky.Course_Work2_2_course.question.Question;

import java.util.HashSet;
import java.util.Set;

public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    //      Метод возвращает коллекцию из уникальных вопросов типа String. Количество вопросов
//      задается как параметр метода - int amount.
    @Override
    public Set<Question> getQuestions3(int amount){
        Set<Question> questions = new HashSet<>();
        if (questionService.getAll().size() < amount) {
            throw new NumberOfQuestionsExceededException("\n" +
                    "Exceeded quantity");
        }

        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }

        return   questions;
    }
}
