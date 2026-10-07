// Given the integer day denoting the day number, print on the screen which day
// of the week it is. Week starts from Monday and for values greater than 7 or less than 1,
// print Invalid.
// Ensure only the 1st letter of the answer is capitalised.

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    in.close();

    switch (num) {
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        default -> System.out.println("Invalid");
    }
        
    }
}

