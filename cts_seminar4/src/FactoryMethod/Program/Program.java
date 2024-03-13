package FactoryMethod.Program;

import FactoryMethod.Clase.Medicament;
import FactoryMethod.Fabrici.*;

public class Program {
    public static void main(String[] args) {
        FabricaMedicamente fabricaRaceala = new FabricaRaceala("Paracetamol", 10);
        Medicament med_1 = fabricaRaceala.creareMedicament();
        FabricaMedicamente fabricaDurere = new FabricaDurere("Ibuprofen", 15);
        Medicament med_2 = fabricaDurere.creareMedicament();
        FabricaGripa fabricaGripa = new FabricaGripa("Aspirina", 20);
        Medicament med_3 = fabricaGripa.creareMedicament();
        System.out.println(med_1.afisareMedicament());
        System.out.println(med_2.afisareMedicament());
        System.out.println(med_3.afisareMedicament());

        FabricaMedicamente fabricaMedicamente = new FabricaRaceala("Paracetamol", 10);
        procesareMedicament(fabricaMedicamente);
        fabricaMedicamente = new FabricaGripa("Aspirina", 20);
        procesareMedicament(fabricaMedicamente);

    }

    public static void procesareMedicament(FabricaMedicamente fabricaMedicamente)
    {
        Medicament med = fabricaMedicamente.creareMedicament();
        System.out.println(med.afisareMedicament());
    }
}

