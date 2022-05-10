package ua.com.alevel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.EntityNotFoundException;
import java.util.Locale;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {IllegalEnteredArgument.class})
    public ResponseEntity<String> illegalEnteredArgument(IllegalEnteredArgument illegalEnteredArgument){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(illegalEnteredArgument.getMessage());
    }

    @ExceptionHandler(value = {EntityNotFoundException.class})
    public ResponseEntity<String> entityNotFoundException(EntityNotFoundException entityNotFoundException){
        String message = entityNotFoundException.getMessage().lines().map(x->x.toUpperCase(Locale.ROOT)).toString();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
    }
}
