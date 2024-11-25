package it.epicode.libreria.libri;

import it.epicode.libreria.exceptions.AutoreNonValidoException;
import it.epicode.libreria.exceptions.LibroNonDisponibileException;
import it.epicode.libreria.exceptions.TitoloNonValidoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Libro {
    private String titolo;
    private String autore;
    private boolean disponile= true;

    private final static Logger LOGGER = LoggerFactory.getLogger(Libro.class);

    public Libro(String titolo, String autore) throws TitoloNonValidoException, AutoreNonValidoException {
        LOGGER.debug("Inizializzo il libro");

        LOGGER.debug("Controllo il titolo");
        if(titolo == null || titolo.isEmpty()) {
            throw new TitoloNonValidoException("Il titolo del libro non deve essere vuoto");
        }

        LOGGER.debug("Controllo l'autore");
        if(autore == null || autore.isEmpty()) {
            throw new AutoreNonValidoException("L'autore è obbligatorio");
        }
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public boolean isDisponile() {
        return disponile;
    }

    public void setDisponile(boolean disponile) {
        this.disponile = disponile;
    }

    public void prediInPrestito() throws LibroNonDisponibileException {
        if(!disponile) {
            throw new LibroNonDisponibileException("Il libro non è disponibile");
        }
        disponile=false;
    }
}
