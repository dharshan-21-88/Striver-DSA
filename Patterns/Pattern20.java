//https://takeuforward.org/practice/dsa/pattern-20
package Patterns;

public class Pattern {
    public static void main(String[] args) {
        pattern20(5);
    }

    static void pattern20(int n) {
        int space = 2*n -2;
        int space2 = 2;
        for (int i = 0; i < 2*n-1; i++) {
            if(i < n){
                //stars
                for (int j = 1 ; j <= i+1; j++) {
                    System.out.print("*");
                }
                //spaces
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                //stars
                for (int j = 1 ; j <= i+1; j++) {
                    System.out.print("*");
                }
                space -=2;
            }
            else{
                //stars
                for (int j = 2*n-1-i; j > 0; j--) {
                    System.out.print("*");
                }
                //spaces
                for (int j = 0; j < space2 ; j++) {
                    System.out.print(" ");
                }
                //stars
                for (int j = 2*n-1-i ; j > 0; j--) {
                    System.out.print("*");
                }
                space2 +=2;
            }
            System.out.println();
        }
    }
}

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *