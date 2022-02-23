package Main;


import java.util.List;

import CTS.Girafa;
import CTS.IngrijitorZOO;
import CTS.Zebra;
import CTS.Zoo;
public class Main {
	public static void main(String[] args) {
		IngrijitorZOO i1= new IngrijitorZOO("ingrijitor1");
		Zoo z1= new Zoo("Zoo1", i1);
		Zebra zebra1= new Zebra("zebra1");
		Zebra zebra2= new Zebra("zebra2");
		Girafa girafa1=new Girafa("girafa1");
		Girafa girafa2=new Girafa("girafa2");
		z1.addAnimal(zebra1);
		z1.addAnimal(zebra2);
		z1.addAnimal(girafa1);
		z1.addAnimal(girafa2);
		z1.hranesteAnimale("mancare");
	}
}
