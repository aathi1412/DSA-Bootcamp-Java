package Arrays.Arrays2D;

public class transpose {
    public static void main(String[] args) {
        int[][] a = {{1,6,7}, {9,18,15}, {21,8,14}};
        int[][] b = new int[a.length][a.length];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
               System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

    }
}
