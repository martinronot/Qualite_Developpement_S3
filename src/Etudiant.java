import java.util.Map;

public class Etudiant {
    Identite identite;
    Formation formation;
    Map<String, Map<Integer, Integer>> resultats;

    public void addNote(String matiere, int note) {
        if (note >= 0 && note <= 20){
            Integer i=note;
            this.resultats.put(matiere,i);
        }
    }

    public float moyenne(String matiere) {
        int somme = 0;
        foreach ()
    }













    public Formation getFormation(){
        return this.formation;
    }

}