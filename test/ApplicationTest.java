import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void testCalculateSum() {
        Assertions.assertEquals(3, Application.calculateSum(1,2));
        Assertions.assertEquals(4, Application.calculateSum(2,2));
        Assertions.assertEquals(2, Application.calculateSum(0,2));
        Assertions.assertEquals(-1, Application.calculateSum(-1,2));
    }

}