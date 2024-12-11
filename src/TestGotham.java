import java.util.Scanner;

/**
 * Programma che gestisce la prigione di GothamCity
 *
 * @author Stefano
 */
public class TestGotham {

    public static void main(String[] args) {

        /**
         * Creazione nuovi oggetti guardie
         * Inizializzazione Array banca dati guardie
         * Inserimento oggetti guardie dentro banca dati
         * stampa array banca dati guardie.
         *
         */
        Guardia g1 = new Guardia("Davide", 22, 3);
        Guardia g2 = new Guardia("Carlo", 34, 17);
        Guardia g3 = new Guardia("Giggino", 99, 35);

        BancaDatiGuardie bdg = new BancaDatiGuardie(3);
        bdg.addGuardia(g1);
        bdg.addGuardia(g2);
        bdg.addGuardia(g3);

        System.out.println("Stampa Banca Dati Guardie:");
        bdg.printBD();

        System.out.println();


        /**
         * Creazione nuovi oggetti detenuti
         * Inizializzazione Array banca dati detenuti
         * Inserimento oggetti detenuti dentro banca dati
         * stampa array banca dati detenuti.
         *
         */
        Detenuto d1 = new Detenuto("Joker", 32);
        Detenuto d2 = new Detenuto("Pinguino", 60);
        Detenuto d3 = new Detenuto("DueFacce", 50);

        BancaDatiDetenuti bdd = new BancaDatiDetenuti (3);
        bdd.addDetenuto(d1);
        bdd.addDetenuto(d2);
        bdd.addDetenuto(d3);

        System.out.println("Stampa Banca Dati Detenuti:");
        bdd.printBD();

        System.out.println();

        /**
         * Creazione nuovi oggetti fascicoli
         * Inizializzazione Array banca dati fascicoli
         * Inserimento oggetti fascicoli dentro banca dati
         * stampa array banca dati fascicoli.
         *
         */

        BancaDatiFascicoli bdf = new BancaDatiFascicoli (3);

        Fascicolo f1 = new Fascicolo (d1, "10-12-2000", "07-01-2001", "Distruzione città");
        Fascicolo f2 = new Fascicolo (d2, "11-10-1990", "02-03-2021", "Imbrattamento muri");
        Fascicolo f3 = new Fascicolo (d3, "06-05-2002", "08-09-2010", "Persona poco onesta");

        bdf.addFascicolo(f1);
        bdf.addFascicolo(f2);
        bdf.addFascicolo(f3);

        System.out.println("Stampa Banca Dati Fascicoli:");
        bdf.printBD();

        /**
         * RICERCA PER NOME DEL DETENUTO
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Effettua una ricerca del detenuto inserendo il nome: ");
        String nome = s.next().toLowerCase();
        boolean result = bdf.ricercaNome(nome);

        if (result) {
            System.out.println("Si abbiamo un detenuto di nome: " + nome);
        } else {
            System.out.println("Ci dispiace non abbiamo trovato alcun detenuto di nome: " + nome);

        }

        s.close();
    }

}