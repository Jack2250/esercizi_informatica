enum Tipologia {
    cellulare, abitazione, azienda
}

public class Persona {
    public String nome;
    public String cognome;
    public String numDiTelefono;
    public Tipologia tipo;
    public int saldo;

    public Persona(String nome, String cognome, String numDiTelefono, Tipologia tipo) {
        this.nome = nome;
        this.cognome = cognome;
        this.numDiTelefono = numDiTelefono;
        this.tipo = tipo;
    }

    public Persona() {
        this.saldo = 10;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", nome, cognome, numDiTelefono, tipo.toString());
    }

    public String anagrafica() {
        return String.format("Nome: %s Cognome: %s Telefono: %s Tipo: %s Saldo: %d", nome, cognome, numDiTelefono, tipo, saldo);
    }
}
