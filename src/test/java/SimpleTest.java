import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SimpleTest {

    private final Calculatrice calculatrice = new Calculatrice();

    /**
     * Les classes de test et les méthodes de test peuvent déclarer des noms
     * d'affichage personnalisés via @DisplayName — avec des espaces, des
     * caractères spéciaux, et même des emojis - qui seront affichés dans
     * les rapports de test et par les testeurs et IDE
     */
    @Test
    @DisplayName("calcule de l'addition")
    void addition(){
        assertEquals(2,calculatrice.add(1,1));
    }


}


