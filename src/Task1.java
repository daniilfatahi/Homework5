import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Enter a ");
System.out.println(OddNumbers());


    }

    public static boolean OddNumbers(){

        Scanner inScanner = new Scanner(System.in);
        int a = inScanner.nextInt();

        if ( a % 2 == 0) {
            System.out.println("The number is even");

        }
        else
        {
            System.out.println("The number is odd");
        }
        return OddNumbers();



    }

}
