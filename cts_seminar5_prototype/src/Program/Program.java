package Program;

import Prototype.AbstractPrototype;
import Prototype.Client;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> accesorii= new ArrayList<>();
        accesorii.add("fluier");
        accesorii.add("steag");
        Client client1= new Client("Andrei", 17, accesorii);
        AbstractPrototype client2= client1.clone();
        System.out.println(client1);
        System.out.println(client2);
    }
}
