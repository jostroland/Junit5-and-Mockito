import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class TestStandards {


    /**
     * Cette methode est appelé une fois seule avant tous les tests
     */
    @BeforeAll
    static void initAll() {
        System.out.println("initAll");
    }

    /**
     * Cette methode est appelé une fois seule avant chaque test
     * Sauf avant les tests ayant l'annotation @Disabled
     */
    @BeforeEach
    void init() {
        System.out.println("init");
    }
    @Test
    void succeedingTest() {
    }
    @Test
    void failingTest() {
        fail("a failing test");
    }
    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }
    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }
    @AfterEach
    void tearDown() {
    }
    @AfterAll
    static void tearDownAll() {
    }
}
