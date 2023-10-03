public class Conducteur extends Persoon{

    private int ervaring;

    public Conducteur(String naam, int leeftijd) {
        super(naam, leeftijd);
    }

    public int getErvaring() {
        return ervaring;
    }

    public void setErvaring(int ervaring) {
        this.ervaring = ervaring;
    }

    @Override
    public String toString() {
        return "naam:" + this.getNaam() + ", leeftijd: " + this.getLeeftijd() + ". "
                + this.getClass().getSimpleName().toUpperCase() + " met " + this.getErvaring() + " jaar ervaring.";
    }

    public void geefDetails(Conducteur conducteur){
        System.out.println(conducteur.toString());
    }
}
