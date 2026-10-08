//https://takeuforward.org/practice/dsa/pattern-21
package Patterns;

public class Pattern21 {
    public static void main(String[] args) {
        pattern21(5);
    }

    static void pattern21(int n) {
    for (int i = 1; i <= n; i++) {
        if (i == 1 || i == n) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
        } 
        
        else {
            System.out.print("*");

            for (int j = 1; j <= n - 2; j++) {
                System.out.print(" ");
            }

            System.out.print("*");
        }
        System.out.println();
        }
    }
}

// *****
// *   *
// *   *
// *   *
// *****