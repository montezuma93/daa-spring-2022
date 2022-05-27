import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    void testCalculateSum() {
        Assertions.assertEquals(3, Application.calculateSum(1,2));
        Assertions.assertEquals(4, Application.calculateSum(2,2));
        Assertions.assertEquals(2, Application.calculateSum(0,2));
        Assertions.assertEquals(-1, Application.calculateSum(-1,2));
    }@Test
    void testcalculatequotient(){
        Assertions.assertEquals(3, Application.calculateQuotient(6,2) );
        Assertions.assertEquals(4, Application.calculateQuotient(8,2) );
        Assertions.assertEquals(2.5, Application.calculateQuotient(5,2) );
        Assertions.assertEquals(15, Application.calculateQuotient(45,3) );
        Assertions.assertEquals(7, Application.calculateQuotient(14,2) );
        Assertions.assertEquals(0 , Application.calculateQuotient(0,4) );
        Assertions.assertThrows(RuntimeException.class, ()->Application.calculateQuotient(5,0)  );
    }
}