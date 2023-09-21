import java.util.Map;

public class Formation {
    public String identifiant;
    public Map<String, Integer> matieres;

    public void ajout(String matiere, int coef) {
        matieres.put(matiere, coef);
    }

    public void supp(String matiere) {
        matieres.remove(matiere);
    }

    public Integer recup(String matiere) {
        return matieres.get(matiere);
    }
}
