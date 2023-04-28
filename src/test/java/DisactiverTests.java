import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



@Disabled("Disabled until bug #99 has been fixed")
public class DisactiverTests {


    @Test
    @DisplayName("Cet test est désactivé")
    @Disabled("Cet test est désactivé")
    void testDesactiver(){

    }

    @DisplayName("Cet test est activé")
    @Test
    void testActif(){
        assertEquals(true,true);
    }



}
