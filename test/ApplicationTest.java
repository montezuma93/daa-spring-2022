import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ApplicationTest {

    @Test
    public void testCalculateSum() {
        Assertions.assertEquals(3, Application.calculateSum(1,2));
        Assertions.assertEquals(4, Application.calculateSum(2,2));
        Assertions.assertEquals(2, Application.calculateSum(0,2));
        Assertions.assertEquals(-1, Application.calculateSum(-1,2));
    }

    @org.junit.jupiter.api.Test
    void testCalculateDivision() {
        Assertions.assertEquals(2, Application.calculateDivision(4,2));
        Assertions.assertEquals(2.5, Application.calculateDivision(5,2));
        Assertions.assertEquals(5, Application.calculateDivision(10,2));
        Assertions.assertEquals(0, Application.calculateDivision(0,2));
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> Application.calculateDivision(4,0));
        Assertions.assertEquals("test", exception.getMessage());
    }
    @Test
    public void testSubtract() {
        Assertions.assertEquals(2, Application.calculateDifference(5,3));
        Assertions.assertEquals(3, Application.calculateDifference(6,3));
        Assertions.assertEquals(4, Application.calculateDifference(7,3));
        Assertions.assertEquals(5, Application.calculateDifference(8,3));
    }
}