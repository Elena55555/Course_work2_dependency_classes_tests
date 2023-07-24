package com.sky.Course_Work2_2_course.question;

import java.util.Objects;

public class Question {
    // два поля question и answer
    private String question;
    private String answer;

    // генерим конструктор
    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    // генерим сеттеры

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // генерим геттеры

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    // генерим  equals и hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question1 = (Question) o;
        return Objects.equals(question, question1.question) && Objects.equals(answer, question1.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }
    // генерим toString
    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

}
