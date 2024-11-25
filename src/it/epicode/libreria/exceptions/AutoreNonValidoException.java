package it.epicode.libreria.exceptions;

public class AutoreNonValidoException extends Exception{
    public AutoreNonValidoException() {
    }

    public AutoreNonValidoException(String message) {
        super(message);
    }
}

