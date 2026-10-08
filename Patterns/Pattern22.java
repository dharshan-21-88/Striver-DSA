//https://takeuforward.org/practice/dsa/pattern-22
package Patterns;

public class Pattern22 {
    public static void main(String[] args) {
        pattern22(5);
    }

    static void pattern22(int n) {
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top = i;
                int left = j;
                int right = 2*n -2-j;
                int bottom = 2*n -2-i;

                System.out.print(n-Math.min(left,Math.min(Math.min(top, bottom),right)) + " ");
            }
            System.out.println();
        }
    }
}

// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5
