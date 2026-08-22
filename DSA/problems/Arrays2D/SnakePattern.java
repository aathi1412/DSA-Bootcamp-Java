
public class snake1 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = a.length;
        int n = a[0].length-1;
        int[] b = new int[m*n];

        int i = 0;
        int row = 0;
        int col = 0;
        boolean isUp = true;

        while(i <= m*n){
            b[i++] = a[row][col]; 
            if(isUp){
                if(col == n-1){
                    row++;
                    isUp = false;
                }
                else if(row == 0){
                    col++;
                    isUp = false;
                }
                else{
                    row--;
                    col++;
                }
            }   
            else{
                if(row == m-1){
                    col++;
                    isUp = true;
                }
                else if(col == 0){
                    row++;
                    isUp = true;
                }
                else{
                    row++;
                    col--;
                }
            } 
        }


            for (int j = 0; j < b.length; j++) {
                 System.out.println(b[j]);
            }
        
    }
}
