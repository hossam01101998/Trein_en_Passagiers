import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Passagierstrein extends Trein{

    private int maximumCapaciteit;
    private int huidigeCapaciteit;

    public Passagierstrein(String treinNaam) {
        super(treinNaam);
    }

    public int getMaximumCapaciteit() {
        return maximumCapaciteit;
    }

    public void setMaximumCapaciteit(int maximumCapaciteit) {
        if(maximumCapaciteit < 15 && maximumCapaciteit > 0){
            this.maximumCapaciteit = maximumCapaciteit;

        }
        else {this.maximumCapaciteit = 3;}
    }

    public int getHuidigeCapaciteit() {
        return huidigeCapaciteit;
    }

    public void setHuidigeCapaciteit(int huidigeCapaciteit) {
        this.huidigeCapaciteit = huidigeCapaciteit;
    }

    @Override
    public String toString() {
        return "Passagierstrein{" +
                "maximumCapaciteit=" + maximumCapaciteit +
                ", huidigeCapaciteit=" + huidigeCapaciteit +
                '}';
    }
//ongesoorteerde lijst van passagiers:
    ArrayList<Passagier> passagiers = new ArrayList<>();

    public void stapOp(Passagier passagier, Passagierstrein passagierstrein) {
        String treinNaam = Passagierstrein.this.getTreinNaam();
        System.out.println(treinNaam);
        if (passagier.isTicket()) {
            passagiers.add(passagier);
            Passagierstrein.this.huidigeCapaciteit++;
            System.out.println("passagier opgestapt");
        }
        else System.out.println(passagier.getNaam() +" heeft geen ticket!");
    }

    public void stapAf(Passagier passagier, Passagierstrein passagierstrein) throws PassagierNietGevondenException  {
        String treinNaam = Passagierstrein.this.getTreinNaam();
        System.out.println(treinNaam);
        if (passagier.isTicket()) {
            passagiers.remove(passagier);
            Passagierstrein.this.huidigeCapaciteit--;
            System.out.println("passagier afgestapt");
        }
        else {throw new PassagierNietGevondenException();}
    }
    public void geefPassagiersGesorteerdOpNaam(){
        Collections.sort(passagiers);
        for (Passagier p: passagiers);
        System.out.println(passagiers);

    }

    public void geefPassagiersGesorteerdOpLeeftijd(){
       Collections.sort(passagiers, new PassagiersGesorteerdOpLeeftijd());
        for (Passagier p: passagiers);
        System.out.println(passagiers);

}
}
