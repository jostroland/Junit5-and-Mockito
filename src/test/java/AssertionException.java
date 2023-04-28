import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertionException {

    private final String maChaine = null;

    @Test
    void lance_une_exception(){
        Exception exception = assertThrows(NullPointerException.class,()->
                Objects.requireNonNull(maChaine)
        );

        assertEquals(null,exception.getMessage());
    }
}
