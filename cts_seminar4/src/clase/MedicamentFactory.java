package clase;

public class MedicamentFactory {
    public static Medicament creareMedicament(TipMedicament tip, String denumire, float pret){
        switch (tip){
            case BODY : return new Body(denumire, pret);
            case DURERE: return new Durere(denumire, pret);
            case RACEALA: return new Raceala(denumire, pret);
            case GRIPA: return new Gripa(denumire, pret);
            default: return null;
        }

    }
}
