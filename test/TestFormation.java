import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFormation {

    Formation formation;

    @BeforeEach
    public void init() {
        this.formation = new Formation("id");
    }

    @Test
    public void testAjout() {
        this.formation.ajout("histoire", 5);
        assertEquals(5, this.formation.matieres.get("histoire"), "Problème d'ajout d'une matière");
    }

    @Test
    public void testRecup() {
        this.formation.ajout("histoire", 5);
        assertEquals(5, this.formation.recup("histoire"), ("Problème de récupération d'une matière"));
    }

    @Test
    public void testSupp() {
        this.formation.ajout("histoire", 5);
        this.formation.supp("histoire");
        assertEquals(null, this.formation.matieres.get("histoire"));
    }

    @Test
    public void testGetIdentifiant() {;
        assertEquals("id", this.formation.identifiant, "Problème de récupération d'identifiant");
    }

    @Test
    public void testGetMatieres() {
        assertEquals(this.formation, this.formation.getMatieres(), "Problème de récuperation de matière");
    }
}
