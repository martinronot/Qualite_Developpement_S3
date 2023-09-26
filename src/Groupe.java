import java.util.Map;
import java.util.Set;

public class Groupe {
    private Set<Etudiant> etudiants;
    private Formation formation;

    public Groupe(Set<Etudiant> e, Formation f){
        this.etudiants=e;
        this.formation=f;
    }

    public void ajouterEtudiant(Etudiant e){
        if(e.getFormation()==this.formation){
            this.etudiants.add(e);
        }
    }

    public void supprimerEtudiant(Etudiant e){
        this.etudiants.remove(e);
    }


}
