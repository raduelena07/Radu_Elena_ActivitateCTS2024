package clase;

public class Body extends Medicament{

    protected Body(String denumire, float pret){
        super(denumire, pret);
    }
    public void afisareDetalii(){
        //System.out.printf("%s costa %f lei si este bun pentru corp", super.getDenumire(), super.getPret());
        System.out.println("Medicamentul " + super.getDenumire() + "costa " + super.getPret()+ "si este bun pentru corp");
    }
}
