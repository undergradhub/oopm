import java.io.*;
import java.util.*;

class matmulti {
    public static void main(String args[]) throws IOException {
        int i, j, k;
        int a[][] = { { 1, 2, 3 }, { 2, 1, 3 }, { 3, 2, 1 } };
        int b[][] = { { 3, 2, 3 }, { 2, 2, 3 }, { 3, 4, 1 } };
        int c[][] = new int[3][3];

        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                for (k = 0; k < 3; k++)
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    System.out.println("resultant matrix as");
                    for (i = 0; i < 3; i++) {
                        for (j = 0; j < 3; j++) {
                            System.out.print("  " + c[i][j]);
                        }
                        System.out.println();
                    }
    }
}
