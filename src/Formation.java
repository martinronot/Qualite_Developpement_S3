import java.util.Map;

public class Formation {
    private String identifiant;
    private Map<String, Integer> matieres;

    public void ajout(String matiere, int coef) {
        matieres.put(matiere, coef);
    }

    public void supp(String matiere) {
        matieres.remove(matiere);
    }

    public int recup(String matiere) {
        return matieres.get(matiere);
    }
}
