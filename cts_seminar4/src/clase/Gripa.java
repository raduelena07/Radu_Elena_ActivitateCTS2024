package clase;

public class Gripa extends Medicament{

    protected Gripa(String denumire, float pret) {
        super(denumire, pret);
    }

    public void afisareDetalii(){
        System.out.printf("%s costa %f lei si este bun pentru durere", super.getDenumire(), super.getPret());
    }
}
