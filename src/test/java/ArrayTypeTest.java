import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTypeTest {

    private static ArrayType arrayType;

    @BeforeAll
    public static void setup() {
        int[] array = {2, 4, 1, 3, 5};
        arrayType = new ArrayType(array);
    }

    @Test
    public void checkArrayType() {
        assertEquals(3, arrayType.findArrayType());
    }

    @Test
    public void checkEvenArray() {
        assertEquals(false, arrayType.evenArray());
    }

    @Test
    public void checkOddArray() {
        assertEquals(false, arrayType.oddArray());
    }
}
