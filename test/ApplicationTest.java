import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void testCalculateSum() {
        Assertions.assertEquals(3, Application.calculateSum(1,2));
        Assertions.assertEquals(4, Application.calculateSum(2,2));
        Assertions.assertEquals(2, Application.calculateSum(0,2));
        Assertions.assertEquals(1, Application.calculateSum(-1,2));
    }

    @Test
    void testCalculateQuotient() {
        Assertions.assertEquals(3, Application.calculateQuotient(6,2));
        Assertions.assertEquals(2, Application.calculateQuotient(8,4));
        Assertions.assertEquals(-8, Application.calculateQuotient(8,-1));
        Assertions.assertEquals(2.66, Application.calculateQuotient(8,3));
        Assertions.assertThrows(Exception.class ,()-> Application.calculateQuotient(8,0));
    }

}