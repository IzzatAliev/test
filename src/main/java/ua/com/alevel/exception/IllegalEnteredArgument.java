package ua.com.alevel.exception;

import org.springframework.http.HttpStatus;


public class IllegalEnteredArgument extends RuntimeException {

    private HttpStatus httpStatus;

    public IllegalEnteredArgument() {
    }

    public IllegalEnteredArgument(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
