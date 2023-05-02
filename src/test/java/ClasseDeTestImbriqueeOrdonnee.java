import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static junit.framework.TestCase.assertTrue;


//@TestClassOrder(ClassOrderer.OrderAnnotation.class)
public class ClasseDeTestImbriqueeOrdonnee {

    @Nested
    //@Order(1)
    class PrimaryTests {

        @Test
        void test1() {
        }
    }

    @Nested
    //@Order(2)
    class SecondaryTests {

        @Test
        void test2() {
        }
    }

    @RepeatedTest(10)
    void repeatedTest() {
        // ...
    }

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {
        assertTrue( candidate,candidate.length() == 5);
    }

}
