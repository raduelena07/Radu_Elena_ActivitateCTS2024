package Program;

import clase.Durere;
import clase.Medicament;
import clase.MedicamentFactory;
import clase.TipMedicament;

public class Program {
    public static void main(String[] args) {
        try {
            //Medicament durere = MedicamentFactory.creareMedicament(TipMedicament.DURERE, "Nurofen", 32);
            //durere.afisareDetalii();
            //Durere durere1= new Durere("Panadol", 22);
           // durere1.afisareDetalii();

            Medicament body= MedicamentFactory.creareMedicament(TipMedicament.BODY, "Nivea", 29);
            body.afisareDetalii();

            Medicament raceala= MedicamentFactory.creareMedicament(TipMedicament.RACEALA, "fervex", 7);

        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}
