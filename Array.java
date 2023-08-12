/*3D Array Java Program */

class Array {

    public static void main(String Args[]) {
        int Array[][][] = new int [3][4][5];
        int i, j, k;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    Array[i][j][k] = i * j * k;
                }
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    // Below we have used "print" because it cannot takes the null value and doesn't end with "\n".
                    System.out.print(Array[i][j][k] + " ");
                
                
                }
            }
                 System.out.println(); // Here we have used1 "println" because it takes the null value and prints "\n" by defualt at the end.
     }
}
}