package FactoryMethod.Clase;

public class Raceala extends Medicament{
    private int cantitate;
    public Raceala(String denumire, float pret, int cantitate) {
        super(denumire, pret);
        this.cantitate=0;

    }

    protected Raceala(String denumire, float pret) {
        super(denumire, pret);
        this.cantitate = 0;
    }

    @Override
    public String afisareMedicament() {
        return "Medicamentul pentru raceala " + super.getDenumire() + " are pretul de " + super.getPret() + " RON";
    }
}
