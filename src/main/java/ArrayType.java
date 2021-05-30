public class ArrayType {
    private final int[] array;

    public ArrayType(int[] array) {
        this.array = array;
    }

    public int findArrayType() {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount += 1;
            } else {
                evenCount += 1;
            }
        }

        if (evenCount == array.length) {
            return 1;
        } else if (oddCount == array.length) {
            return 2;
        } else {
            return 3;
        }
    }
}
