package it.epicode.testlog;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER= LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        // livello info - info, error
        // livello debug - debug, info, error

        LOGGER.info("Programma iniziato");
        LOGGER.debug("Debug del programma");
        LOGGER.error("Errore");

        System.out.println("System out");
    }
}
