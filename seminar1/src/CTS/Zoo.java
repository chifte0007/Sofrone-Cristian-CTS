package CTS;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private String nume;
	private IngrijitorZOO ingrijitorZOO;
	private List<Animal> animale;
	public Zoo(String nume, IngrijitorZOO ingrijitorZOO) {
		super();
		this.nume = nume;
		this.ingrijitorZOO = ingrijitorZOO;
		this.animale = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal animal) {
		animale.add(animal);
	}
	public void hranesteAnimale(String hrana) {
		for( Animal animal:animale) {
			ingrijitorZOO.hranesteAnimal(animal, hrana);
		}
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public IngrijitorZOO getIngrijitorZOO() {
		return ingrijitorZOO;
	}
	public void setIngrijitorZOO(IngrijitorZOO ingrijitorZOO) {
		this.ingrijitorZOO = ingrijitorZOO;
	}
	public List<Animal> getAnimale() {
		return animale;
	}
	public void setAnimale(List<Animal> animale) {
		this.animale = animale;
	}
	
	
	
}
