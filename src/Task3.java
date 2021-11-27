public class Task3 {
    public static void main(String[] args) {
        char[] array1 = new char [100];
        int d;
        int[] array = getArray();
        convert(array,array1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    public static void convert(int[] array, char[] array1) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            // this converts a integer into a character
            array1[i] = (char) array[i];
        }
    }

    public static int[] getArray() {
        int[] array = {1,2,3,4,5,};
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random());
        }
        System.out.println();
        return array;
    }

}