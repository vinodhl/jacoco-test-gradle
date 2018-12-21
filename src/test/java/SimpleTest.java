import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


 class SimpleTest {



    @Test
    void add() {
        assertEquals(5, new Simple().add(2,3));
    }

    @Test
    void subtract() {
        assertEquals(0, new Simple().subtract(3,3));
    }
}