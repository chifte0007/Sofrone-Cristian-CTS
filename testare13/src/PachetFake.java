import agentie.IPachetTuristic;

public class PachetFake implements IPachetTuristic {

    boolean rezervare;
    double pret;


    @Override
    public boolean poateRezerva() {
        return this.rezervare;

    }

    public void setRezervare(boolean rezervare) {
        this.rezervare = rezervare;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return this.pret;
    }
}
