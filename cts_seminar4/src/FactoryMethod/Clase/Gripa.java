package FactoryMethod.Clase;

public class Gripa extends Medicament{

    public Gripa(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public String afisareMedicament() {
        return "Medicamentul pentru body " + super.getDenumire() + " are pretul de " + super.getPret() + " RON.";
    }


}
