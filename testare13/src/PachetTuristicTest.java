import agentie.IPachetTuristic;
import agentie.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import persoana.IPersoana;
import testare.categorii.ITesteCuFake;
import testare.categorii.ITesteCuStub;
import testare.categorii.ITesteRight;
import testare.dubluri.PersoanaFake;
import testare.dubluri.PersoanaStub;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PachetTuristicTest {

    @Test
    @Category(ITesteCuStub.class)
    public void testPoateRezerva(){
        IPersoana client=new PersoanaStub();

        IPachetTuristic pachetTuristic=new PachetTuristic(client,"ceva", 100.0);

       assertTrue(pachetTuristic.poateRezerva());


    }

    @Test
    @Category({ITesteCuFake.class, ITesteRight.class})
    public void testNuPoateRezerva(){
        PersoanaFake p1=new PersoanaFake();
        p1.setVarsta(17);

        IPachetTuristic pachetTuristic=new PachetTuristic(p1,"Bucuresti",200.00);
        assertFalse(pachetTuristic.poateRezerva());
    }




}
