package Program;

import Clase.AbstractBuilder;
import Clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        AbstractBuilder abstractBuilder= new Rezervare.BuilderRezervare();
        Rezervare rezervare1= abstractBuilder.adaugaBautura().build();
        Rezervare rezervare2= abstractBuilder.adaugaGenMuzical("rock").build();
        System.out.println(rezervare2);
    }
}
