public class Task2 {
    public static void main(String[] args) {

System.out.println("Sum of array: " + SumofArr());

    }

    public static int SumofArr(){

        int[] MyArray = {1, 25, 31, 55};
        int sum = 0;
        for (int i = 0; i < MyArray.length; i++){

            sum += MyArray[i];
        }

        return sum;


    }
}
