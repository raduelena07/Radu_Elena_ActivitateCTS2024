package clase;

public abstract class Medicament {
    private String denumire;
    private float pret;

    public Medicament(String denumire, float pret) {
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    public abstract void afisareDetalii();



}
