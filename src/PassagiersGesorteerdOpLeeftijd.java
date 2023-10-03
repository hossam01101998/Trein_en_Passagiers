import java.util.Comparator;

public class PassagiersGesorteerdOpLeeftijd extends Comparator<Passagier> {

    public PassagiersGesorteerdOpLeeftijd() {
    }

    @Override
    public String toString() {
        return "PassagiersGesorteerdOpLeeftijd{}";
    }

    @Override
    public int compare(Passagier o1, Passagier o2) {
        if(o1.getLeeftijd()>o2.getLeeftijd()){
            return 1;
        } else if (o1.getLeeftijd()>o2.getLeeftijd()) {
            return -1;
        }else
            return 0;
    }
}
