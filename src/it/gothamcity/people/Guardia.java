package it.gothamcity.people;

// Classe che definisce l'oggetto Guardia.

public class Guardia extends Persona{

    // Attributi

    private int anniServizio;

    //Costruttore

    public Guardia(String nome, int età, int anniServizio) {
        super(nome, età);
        this.anniServizio=anniServizio;
    }

    //Metodi

    public int getAnniServizio() {
        return anniServizio;
    }

    @Override
    public String toString() {
        return super.toString() + " Ruolo: Guardia," +
                " anniServizio=" + anniServizio + ".";
    }
}
