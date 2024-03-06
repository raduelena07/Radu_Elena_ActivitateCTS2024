package anofm.main;

import anofm.Manager;
import anofm.ManagerRegistry;

public class Main {
    public static void main(String[] args) {
        ManagerRegistry registru= ManagerRegistry.getInstance();
        registru.inregistreazaManager("CTS.SRL", "Popescu", 10000);
        registru.inregistreazaManager("CTS.SRL", "Ionescu", 50000);
        System.out.println(registru.getManager("CTS.SRL"));


    }
}
