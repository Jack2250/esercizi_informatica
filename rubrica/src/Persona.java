enum Tipologia {
    cellulare, abitazione, azienda;
}

public class Persona {
    public String nome;
    public String cognome;
    public String numDiTelefono;
    public Tipologia tipo;
    public int saldoTelefonico;

    //Metodo anagrafica mi stampa tutti i dati di quella persona
    public String anagrafica() {
        return String.format("Nome: %s Cognome: %s Telefono: %s Tipo: %s", nome, cognome, numDiTelefono, tipo);
    }
}