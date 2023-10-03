import java.util.Objects;
import java.util.TreeSet;

public class Persoon implements Comparable<Persoon>{

    private String naam;
    private int leeftijd;

    //unieke een gesoorteerd : dus ik ga een treeset maken;

    //TreeSet <Persoon> personen = new TreeSet<>();

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return "naam:" + this.naam + ", leeftijd: " + this.leeftijd;
    }

    @Override
    public int compareTo(Persoon o) {
        return this.getNaam().compareTo(o.getNaam());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoon persoon)) return false;
        return leeftijd == persoon.leeftijd && Objects.equals(naam, persoon.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, leeftijd);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }


}
