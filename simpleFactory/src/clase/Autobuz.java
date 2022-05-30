package clase;

public class Autobuz extends MijTransportComun{
    

    public Autobuz(String nrInmatriculare) {
		super(nrInmatriculare);
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Autobuz " + getNrInmatriculare();
    }
}
