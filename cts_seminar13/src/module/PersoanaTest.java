package module;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getSexReturnF() {
        // right
        Persoana persoana1= new Persoana("Simona","62542352345");
        assertEquals(persoana1.getSex(),"F");
    }

    @org.junit.Test
    public void getSexReturnM() {
        Persoana persoana2= new Persoana("Ionut","52542352345");
        assertEquals(persoana2.getSex(),"M");
    }

    @org.junit.Test
    public void getSexReturnBoundary() {
        // boundary
        Persoana persoana2= new Persoana("Ioana","62542352345");
        assertEquals(persoana2.getSex(),"F");
        Persoana persoana3= new Persoana("Ionut","12542352345");
        assertEquals(persoana3.getSex(),"M");
    }

    @Test
    public void getSexCrossCheck() {
        Persoana persoana= new Persoana ("Maria", "6020113123456");
        assertEquals(persoana.CNP.charAt(0)%2==0?"F":"M", persoana.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition(){
        Persoana persoana= new Persoana("Maria", "0020113123456");
        persoana.getSex();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getErrorForEmptyString(){
        Persoana persoana= new Persoana("Maria", "");
        persoana.getSex();
    }

    @Test(timeout = 200)
    public void getPerformance(){
        Persoana persoana= new Persoana("Ionut","52542352345");
        persoana.getSex();
    }

    @Test
    public void getConformanceForM(){
        Persoana persoana= new Persoana("Ionut","12542352345");
        String expected= persoana.getSex();
        assertTrue(expected.equals("F")||expected.equals("M"));
    }

    @Test
    public void getSexOrder(){
        Persoana persoana= new Persoana("Ionut","22542352345");
        Persoana persoana1= new Persoana("Maria","12542352345");
        String expected= persoana.getSex();
        assertTrue(persoana1.getSex().compareTo(persoana.getSex())>0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexNullValue(){
        Persoana persoana= new Persoana("Ionut",null);
        persoana.getSex();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexZeroValue(){
        Persoana persoana= new Persoana("Ionut","0000000000000");
        persoana.getSex();
    }

}