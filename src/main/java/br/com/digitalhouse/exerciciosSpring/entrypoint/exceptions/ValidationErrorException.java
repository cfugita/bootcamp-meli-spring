package br.com.digitalhouse.exerciciosSpring.entrypoint.exceptions;

public class ValidationErrorException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ValidationErrorException(String message) { super(message); }
    public ValidationErrorException(String message, Throwable cause) { super(message, cause); }

}
