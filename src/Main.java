import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
int age = 30;
        System.out.println("how are you doing");
        System.out.println(age);
        Date now = new Date ();
        System.out.println(now);
        byte x = 1;
        byte y = x;
        x = 2;
        int password = 6754;
        System.out.println(x);
        String message = "what is your name" + " age";
        System.out.println(message);
        System.out.println(message.endsWith("what is your name" + " age"));
        System.out.println(message.startsWith("what"));

        int [] numbers = {2,34,5,67,7,8,};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // multi dimensional array

        int [] [] number = {{2,34,5,67,7,8,}, {2,34,5,6,7}};
    number[0] [0] = 1;
        System.out.println(Arrays.deepToString(number));

        Scanner scanner = new Scanner (System.in);
        System.out.print("cage:");
        byte cage = scanner.nextByte();
        System.out.println("you are " + cage);


    }
}