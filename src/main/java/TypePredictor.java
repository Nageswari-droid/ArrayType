import java.util.Map;
import java.util.Scanner;

public class TypePredictor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> arrayTypeMap = Map.of(1, "Even", 2, "Odd", 3, "Mixed");

        int arraySize;
        arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayType arrayType = new ArrayType(array);

        System.out.println("The array is " + arrayTypeMap.get(arrayType.findArrayType()));
    }
}
