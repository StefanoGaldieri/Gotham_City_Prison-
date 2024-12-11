import java.util.Arrays;

public class BancaDatiDetenuti {


    //Attributi

    private Detenuto[] detenuti;
    private int size;
    private int currentSize;


    //Costruttore

    public BancaDatiDetenuti(int size) {

        this.size = size;
        this.currentSize = 0;
        this.detenuti = new Detenuto[size];

    }

    //Metodi

    //Aggiunge un Detenuto
    public boolean addDetenuto(Detenuto a) {
        if(currentSize < size) {
            detenuti[currentSize] = a;
            currentSize ++;
            return true;
        }
        else {
            return false;
        }
    }

    //Stampa BancaDati
    public void printBD () {

        for (int i=0; i<detenuti.length;i++) {
            System.out.println(detenuti[i]);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " BancaDatiDetenuti [detenuti=" + Arrays.toString(detenuti) + ", size=" + size + ", currentSize="
                + currentSize + "]";
    }


}
