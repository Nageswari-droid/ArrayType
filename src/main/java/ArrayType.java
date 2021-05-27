public class ArrayType {
    private final int[] array;

    public ArrayType(int[] array) {
        this.array = array;
    }

    public int findArrayType() {
        if (evenArray()) {
            return 1;
        } else if (oddArray()) {
            return 2;
        }
        return 3;
    }

    public boolean evenArray() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean oddArray() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
