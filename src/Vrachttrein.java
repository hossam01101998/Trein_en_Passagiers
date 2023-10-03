public class Vrachttrein extends Trein{

    public Vrachttrein(String treinNaam) {
        super(treinNaam);
    }

    private int laadVermogen = 60;
    private int geladen =0;

    public int getLaadVermogen() {
        return laadVermogen;
    }

    public void setLaadVermogen(int laadVermogen) {
        this.laadVermogen = laadVermogen;
    }

    public int getGeladen() {
        return geladen;
    }

    public void setGeladen(int geladen) {
        this.geladen = geladen;
    }
    public void afladen(String treinNaam){
        this.geladen=0;
        System.out.println("De vrachttrein is afgeladen");
    }

    @Override
    public String toString() {
        return "Vrachttrein{" +
                "laadVermogen=" + laadVermogen +
                ", geladen=" + geladen +
                '}';
    }
}
