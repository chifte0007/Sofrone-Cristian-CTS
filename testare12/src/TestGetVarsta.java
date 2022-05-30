import clase.Persoana;
import exceptie.ExceptieCNPGresit;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGetVarsta {

    @org.junit.Test
    public void getVarsta() {
        Persoana persoana = new Persoana("Stanescu ", "199222222222");
        assertEquals(21, persoana.getVarsta());
    }


    @Test
    public void boundaryGetVarsta() {
        Persoana persoana = new Persoana("Stanescu ", "300222222222");

        assertEquals(220, persoana.getVarsta());

    }

    @Test
    public void boundary2GetVarsta() {
        Persoana persoana2 = new Persoana("Stanescu ", "622010122222");
        assertEquals(0, persoana2.getVarsta());


    }

    @Test(expected = ExceptieCNPGresit.class)
    public void errorTestGetVarsta(){
        Persoana persoana = new Persoana("Stanescu ", "3552222222222");
        persoana.getVarsta();


    }


    @Test(expected = NumberFormatException.class)
    public void error2TestGetVarsta(){
        Persoana persoana = new Persoana("Stanescu ", "zgfagfafa");
        persoana.getVarsta();
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void error3TestGetVarsta(){
        Persoana persoana = new Persoana("Stanescu ", "1222");
        persoana.getVarsta();

    }

    @Test
    public void orderTestGetVarsta(){
        Persoana persoana = new Persoana("Stanescu ", "1980622400222");
        Persoana persoana2 = new Persoana("Ana ", "5020622400222");

        assertTrue(persoana.getVarsta()>persoana2.getVarsta());





    }


    @Test(expected = NullPointerException.class)
    public void existanceTestGetVarsta(){
        Persoana persoana = new Persoana("Stanescu ", null);
        persoana.getVarsta();
    }


    @Test(timeout = 100)
    public void performanceTestGetVarsta(){
        Persoana persoana = new Persoana("Stanescu ", "300222222222");
        persoana.getVarsta();
    }

}