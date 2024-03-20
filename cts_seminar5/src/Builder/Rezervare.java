package Builder;

public class Rezervare {
    private boolean areMancare;
    private boolean areBautura;
    private boolean areScaun;
    private boolean areMuzica;
    private String genMuzical;

    protected Rezervare(boolean areMancare, boolean areBautura, boolean areScaun, boolean areMuzica, String genMuzical) {
        this.areMancare = areMancare;
        this.areBautura = areBautura;
        this.areScaun = areScaun;
        this.areMuzica = areMuzica;
        this.genMuzical = genMuzical;
    }

    protected Rezervare(){
        this.areMancare = false;
        this.areBautura = false;
        this.areScaun = false;
        this.areMuzica = false;
        this.genMuzical=null;
    }

    protected boolean isAreMancare() {
        return areMancare;
    }

    protected void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    protected boolean isAreBautura() {
        return areBautura;
    }

    protected void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    protected boolean isAreScaun() {
        return areScaun;
    }

    protected void setAreScaun(boolean areScaun) {
        this.areScaun = areScaun;
    }

    protected boolean isAreMuzica() {
        return areMuzica;
    }

    protected void setAreMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
    }

    protected String getGenMuzical() {
        return genMuzical;
    }

    protected void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "areMancare=" + areMancare +
                ", areBautura=" + areBautura +
                ", areScaun=" + areScaun +
                ", areMuzica=" + areMuzica +
                ", genMuzical='" + genMuzical + '\'' +
                '}';
    }
}
