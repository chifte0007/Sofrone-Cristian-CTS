import persoana.IPersoana;

public class PersoanaFake implements IPersoana {
String gen;
Integer varsta;
Boolean check;

    @Override
    public String getSex() {
        return gen;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return check;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
