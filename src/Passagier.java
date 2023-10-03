import java.util.Objects;

public class Passagier extends Persoon{

private boolean ticket = false;

    public Passagier(String naam, int leeftijd) {
        super(naam, leeftijd);
    }

    public boolean isTicket() {
        return ticket;
    }

    public void setTicket(boolean ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passagier passagier)) return false;
        return ticket == passagier.ticket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticket);
    }

    @Override
    public String toString() {
        return "naam:" + this.getNaam() + ", leeftijd: " + this.getLeeftijd() + ". " +
                this.getClass().getSimpleName().toUpperCase() + isTicket();
    }

    public void geefDetails(Passagier passagier){
        System.out.println(passagier.toString());
    }


}
