import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Assertions {

    private final TransformateurChaime chaime = new TransformateurChaime();


    @Test
    @Tag("Premier Test")
    @DisplayName("Ce test permet de vérifier le nombre de lettre d'un mot")
    void compteur_nombre_de_lettre(){
        assertEquals(5,chaime.computeLetter("adama"));
    }

    @Test
    @Tag("Second Test")
    @DisplayName("Cet permet de vérifier toute les méthode de la classe --TransformateurChaime--")
    void tous_verifier(){
        String mot = "adama";
        assertAll(mot,
                () -> assertEquals(5, chaime.computeLetter(mot)),
                () -> assertFalse(chaime.contientPlusDeDixLettre(mot), () -> mot +" ne contient pas plus de 10 lettres ")

        );
    }
}

class TransformateurChaime{

    public long computeLetter(String mot){
        return mot.chars().asLongStream().count();
    }

    public boolean contientPlusDeDixLettre(String mot){
        return mot.length() > 10;
    }
}
