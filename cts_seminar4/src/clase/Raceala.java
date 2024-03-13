package clase;

public class Raceala extends Medicament{

    private int Valabilitate;
    protected Raceala(String denumire, float pret) {
        super(denumire, pret);
        Valabilitate=0;
    }

    protected Raceala(String denumire, float pret, int valabilitate) {
        super(denumire, pret);
        Valabilitate = valabilitate;
    }

    public void afisareDetalii(){
        System.out.printf("%s costa %f lei si este bun pentru raceala", super.getDenumire(), super.getPret());
    }
}
