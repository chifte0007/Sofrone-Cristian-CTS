import agentie.AgentieTurism;
import agentie.IPachetTuristic;
import agentie.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.categorii.ITesteCuDummy;
import testare.categorii.ITesteCuFake;
import testare.dubluri.PachetDummy;
import testare.dubluri.PachetFake;

import static org.junit.Assert.*;

public class AgentieTurismTest {
/*
    @Test
    @Category(ITesteCuDummy.class)
    public void testAdaugaPachet(){
        AgentieTurism agentieTurism=new AgentieTurism();
        IPachetTuristic pachetD=new PachetDummy();

        agentieTurism.adaugaPachet((PachetTuristic) pachetD);
        assertEquals(1,agentieTurism.getNumarpacheteTuristice());
    }
*/
    @Test
    @Category(ITesteCuFake.class)
    public void calculSumaPachete(){
        AgentieTurism agentieTurism=new AgentieTurism();
        PachetFake pachetF1=new PachetFake();
        PachetFake pachetF2=new PachetFake();

        pachetF2.setPret(1000);
        pachetF2.setPret(500);



    }


}