package Builder;

public class RezervareBuilder implements AbstractBuilder{
    private Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare();
    }

    @Override
    public Rezervare build() {
        return null;
    }

    @Override
    public AbstractBuilder adaugaScaunErgonomic() {
        rezervare.setAreScaun(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaMancare() {
        rezervare.setAreMancare(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaBautura() {
        rezervare.setAreBautura(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaMuzica() {
        rezervare.setAreMuzica(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaGenMuzical(String genMuzical) {
        rezervare.setGenMuzical(genMuzical);
        return this;
    }
}
