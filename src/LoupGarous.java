/**
 * Created by Gaby on 29/11/2016.
 */
public class LoupGarous {
    private String nom;
    private int num;

    public LoupGarous(String nom, int num) {
        this.nom = nom;
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public String toString(){
        return "Le nom est "+ this.getNom()+" numéro de carte :"+this.getNum()+"";

    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
