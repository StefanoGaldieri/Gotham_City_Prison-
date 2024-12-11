public class BancaDatiFascicoli {

    //Attributi

    private Fascicolo[] fascicoli;
    private int size;
    private int currentSize;

    //Costruttore

    public BancaDatiFascicoli(int size) {
        this.size = size;
        this.currentSize = 0;
        this.fascicoli = new Fascicolo[size];

    }


    //Metodi

    //Aggiungi fascicolo = nuovo detenuto

    public boolean addFascicolo(Fascicolo a) {
        if(currentSize < size) {
            fascicoli[currentSize] = a;
            currentSize ++;
            return true;
        }
        else {
            return false;
        }
    }


    //Stampa BancaDati fascicoli
    public void printBD () {

        for (int i=0; i<fascicoli.length;i++) {
            System.out.println(fascicoli[i]);
        }

    }

    //Ricerca per nome
    public boolean ricercaNome(String nome) {
        for (int i=0; i<currentSize;i++)
            if (nome.equals(fascicoli[i].getDetenuto().getNome()))
                return true;
        return false;
    }
}
