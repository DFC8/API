package br.com.dfc8.api.services.exceptions;

public class DataIntegratyVaiolationException extends RuntimeException {
    public DataIntegratyVaiolationException(String message) {
        super(message);
    }
}
