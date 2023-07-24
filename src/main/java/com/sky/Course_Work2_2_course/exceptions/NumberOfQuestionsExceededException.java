package com.sky.Course_Work2_2_course.exceptions;

public class NumberOfQuestionsExceededException extends RuntimeException {
    public NumberOfQuestionsExceededException() {
    }

    public NumberOfQuestionsExceededException(String message) {
        super(message);
    }

    public NumberOfQuestionsExceededException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberOfQuestionsExceededException(Throwable cause) {
        super(cause);
    }
}
