import clase.Matematica;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MatematicaTest {
    private Matematica matematica;

    @Before
    public void setUp(){
        matematica=new Matematica();
    }


    @Test
    public void testSumaCorecta(){
        int rezultat= matematica.suma(5,9);
        assertEquals(14,rezultat);
    }

    @Test
    public void testRaportCorect() {
        double rezultat = matematica.raport(27, 6);
        assertEquals(4.5,rezultat,0.001);
    }

    @Test
    public void testRaportShouldThrowException(){
        try{
            matematica.raport(34,0);
            fail("Nu trebuia sa ajunga aici");
        }


        catch (IllegalArgumentException exception){

        }
    }

    @Test
    public void testEsteParCorect(){
        assertTrue(matematica.estePar(6));
        assertTrue(matematica.estePar(18));
        assertFalse(matematica.estePar(5));




    }

    @Test
    public void testNumerePareNotNull(){
        List<Integer> lista= matematica.nNumerePare(2);
        assertNotNull(lista);


    }



}