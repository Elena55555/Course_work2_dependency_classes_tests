package com.sky.Course_Work2_2_course.exceptions;

public class NullCollectionException extends RuntimeException {

    public NullCollectionException() {
    }

    public NullCollectionException(String message) {
        super(message);
    }

    public NullCollectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullCollectionException(Throwable cause) {
        super(cause);
    }

}
