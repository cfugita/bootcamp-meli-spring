package br.com.digitalhouse.exerciciosSpring.entrypoint.controller.exception;

import br.com.digitalhouse.exerciciosSpring.entrypoint.exceptions.ValidationErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Calendar;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(ValidationErrorException.class)
    public ResponseEntity<Object> notFound (ValidationErrorException e) {

        StandardError err = new StandardError(
                Calendar.getInstance().getTime(),
                HttpStatus.BAD_REQUEST.value(),
                "Bad Request",
                e.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }
}
