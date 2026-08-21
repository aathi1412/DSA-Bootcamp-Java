package Arrays.Arrays2D;

import java.util.*;
public class convert_1D_to_2D {
    public static void main(String[] args) {
        //int[] a = {1,2,3,4,5,6};
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];

        int[][] aa = new int[2][3];
        int k =0;
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                aa[i][j] = a[k];
                k++;
            } 
        } 

         for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(aa[i][j]);
            } 
            System.out.println();
        }
    }
    
}
