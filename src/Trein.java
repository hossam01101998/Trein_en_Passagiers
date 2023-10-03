public abstract class Trein {
    private String treinNaam;
    private Conducteur conducteur;

    public Trein(String treinNaam) {
        this.treinNaam = treinNaam;
    }

    public String getTreinNaam() {
        return treinNaam;
    }

    public void setTreinNaam(String treinNaam) {
        this.treinNaam = treinNaam;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }
}
