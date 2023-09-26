public class Identite {
    private String nip;
    private String nom;
    private String prenom;

    public Identite(String n, String n2, String n3){
        this.nip=n;
        this.nom=n2;
        this.prenom=n3;
    }

    public String getNip() {
        return nip;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
