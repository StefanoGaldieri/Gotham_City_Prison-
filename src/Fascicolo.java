// Questo è il fascicolo di ogni detenuto

public class Fascicolo {

    //Attributi

    private Detenuto detenuto;
    private String dataCarcerazione;	// LocalDate
    private String dataScarcerazione;
    private String crimineCommesso;


    //Costruttore

    public Fascicolo(Detenuto detenuto, String dataCarcerazione, String dataScarcerazione,
                     String crimineCommesso) {
        this.detenuto = detenuto;
        this.dataCarcerazione = dataCarcerazione;
        this.dataScarcerazione = dataScarcerazione;
        this.crimineCommesso = crimineCommesso;
    }


    //Metodi

    public Detenuto getDetenuto() {
        return this.detenuto;
    }

    public String getDataCarcerazione() {
        return dataCarcerazione;
    }

    public String getDataScarcerazione() {
        return dataScarcerazione;
    }

    public String getCrimineCommesso() {
        return crimineCommesso;
    }


    @Override
    public String toString() {
        return
                " Ruolo: Detenuto " + detenuto.toString() +
                        "Data Carcerazione: " + dataCarcerazione + "\n" +
                        "Data Scarcerazione: " + dataScarcerazione + "\n" +
                        "Crimine commesso: " +  crimineCommesso + "\n";
    }

}

