package it.epicode.libreria.libri;

import it.epicode.libreria.exceptions.*;

public class Ebook extends Libro{
    private int maxPrestiti;
    private int prestitiCorrenti;

    public Ebook(String titolo, String autore, int maxPrestiti, int prestitiCorrenti) throws TitoloNonValidoException, AutoreNonValidoException, MaxPrestitiMaggioreZeroException {
        super(titolo, autore);

        if(maxPrestiti<1) {
            throw new MaxPrestitiMaggioreZeroException("Il numero prestiti deve essere maggiore di 0");
        }
        this.maxPrestiti = maxPrestiti;
        this.prestitiCorrenti = 0;


    }

}
