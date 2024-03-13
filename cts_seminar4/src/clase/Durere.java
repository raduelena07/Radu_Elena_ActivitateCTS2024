package clase;

public class Durere extends Medicament {

    protected Durere(String denumire, float pret) {
        super(denumire, pret);
    }

    public void afisareDetalii(){
        System.out.printf("%s costa %f lei si este bun pentru durere", super.getDenumire(), super.getPret());
    }
}
