import java.util.Arrays;

public class BancaDatiGuardie {

    //Attributi

    private Guardia[] guardie;
    private int size;
    private int currentSize;

    //Costruttore

    public BancaDatiGuardie(int size) {
        this.size = size;
        this.currentSize = 0;
        this.guardie = new Guardia[size];

    }

    //Metodi

    //Aggiungi-Assunzione guardia
    public boolean addGuardia(Guardia a) {
        if(currentSize < size) {
            guardie[currentSize] = a;
            currentSize ++;
            return true;
        }
        else {
            return false;
        }
    }


    //Stampa la BancaDati
    public void printBD () {

        for (int i=0; i<guardie.length; i++) {
            System.out.println(guardie[i]);
        }

    }

    @Override
    public String toString() {
        return
                "BancaDatiGuardie [guardie=" + Arrays.toString(guardie) + ", size=" + size + ", currentSize="
                        + currentSize + "]";
    }
}
