package FactoryMethod.Clase;

public class Body extends Medicament{

    public Body(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public String afisareMedicament() {
        return "Medicamentul pentru body " + super.getDenumire() + " are pretul de " + super.getPret() + "RON.";
    }
}
