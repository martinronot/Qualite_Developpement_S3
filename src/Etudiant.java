import java.util.HashMap;
import java.util.List;

public class Etudiant {
    Identite identite;
    Formation formation;
    HashMap<String, List<Double>> resultats;

    public void addNote(String matiere, double note) {
        if (note >= 0 && note <= 20 && this.resultats.containsKey(matiere)) {
            this.resultats.get(matiere).add(0, note);
        } else {
            System.out.println("Impossible d'ajouter une note");
        }
    }

    public float moyenne(String matiere) {
        int moy = 0;
        int i = 0;
        for (double note : this.resultats.get(matiere)) {
            moy += note;
            i++;
        }
        return moy/i;
    }

    public double moyenneGenerale () {
        double moyGenerale = 0;
        int i = 0;
        for (String matiere : this.resultats.keySet()) {
            double moy = 0;
            int j = 0;
            for (double note : this.resultats.get(matiere)) {
                moy += note;
                j++;
            }
            moyGenerale += moy * this.formation.getMatieres().get(matiere);
            i++;
        }
        return moyGenerale/i;
    }
    public Formation getFormation(){
        return this.formation;
    }
}