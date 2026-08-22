package Arrays.Arrays2D;

public class snake {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};

        int top = 0;
        int r = a.length-1;
        int l = 0;
        while(top < r){
            for (int i = top; i <= r; i++) {
                System.out.println(a[top][i]);
            }
            top++;

            for (int j = r; j >= l; j--) {
                System.out.println(a[top][j]);
            }
            top++;

            for (int k = l; k <= top; k++) {
                System.out.println(a[top][k]);
            }
        }
    }
}
