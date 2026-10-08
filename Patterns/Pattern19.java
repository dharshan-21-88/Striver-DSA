//https://takeuforward.org/practice/dsa/pattern-19
package Patterns;

public class Pattern19 {

    public static void main(String[] args) {
        pattern19(5);
    }

    static void pattern19(int n) {
        int initSpace = 0;
        int inisSpace = 0;
        for(int i =0;i<2*n;i++){
            if(i < n){
                //star
                for(int j = n-i; j > 0;j--){
                    System.out.print("*");
                }

                //space
                for(int j = 0;j < initSpace;j++){
                    System.out.print(" ");
                }

                //star
                for(int j = n-i;j > 0;j--){
                    System.out.print("*");
                }

                inisSpace = initSpace;
                initSpace +=2;
            }

            else{
                
                //star
                for(int j = 1 ; j <=i-n +1;j++){
                    System.out.print("*");
                }

                //space
                for(int j = 0;j < inisSpace;j++){
                    System.out.print(" ");
                }

                //star
                for(int j = 1 ; j <=i-n +1;j++){
                    System.out.print("*");
                }
                inisSpace -=2;
            }

            System.out.println();
        }
    }
}

// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
