package ua.com.alevel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;

public class JwtAuthenticationException extends AuthenticationException {

    HttpStatus httpStatus;

    public JwtAuthenticationException(String msg) {
        super(msg);
    }

    public JwtAuthenticationException(String msg, HttpStatus httpStatus) {
        super(msg);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
