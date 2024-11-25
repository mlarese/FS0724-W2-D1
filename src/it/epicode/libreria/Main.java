package it.epicode.libreria;

import it.epicode.libreria.exceptions.AutoreNonValidoException;
import it.epicode.libreria.exceptions.LibroNonDisponibileException;
import it.epicode.libreria.exceptions.TitoloNonValidoException;
import it.epicode.libreria.libri.Libro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        try {
            Libro libro = new Libro("hhhh", "");
            libro.prediInPrestito();

        } catch (TitoloNonValidoException | AutoreNonValidoException e) {
            LOGGER.error(e.getMessage());
        } catch (LibroNonDisponibileException e) {
            LOGGER.error(e.getMessage());
        }


    }
}
