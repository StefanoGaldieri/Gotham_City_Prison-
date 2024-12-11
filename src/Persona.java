// Questa classe definisce l'oggetto Persona. Guardia e Detenuto sono persone.

public class Persona {

    //Attributi

    private String nome;
    private int età;


    //Costruttore

    public Persona(String nome, int età) {
        this.nome = nome;
        this.età = età;
    }


    //Metodi

    public String getNome() {
        return nome;
    }

    public int getEtà() {
        return età;
    }

    @Override
    public String toString() {
        return  " Nome= '" + nome + '\'' +
                ", età= " + età + ",";
    }
}
