package FactoryMethod.Clase;

public class Durere extends Medicament{

    public Durere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public String afisareMedicament() {
        return "Medicamentul pentru durere " + super.getDenumire() + " are pretul de " + super.getPret() + " RON.";    }
}
