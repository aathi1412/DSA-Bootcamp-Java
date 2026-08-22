package Arrays.Arrays2D;

public class max_row {
    public static void main(String[] args) {
        int[][] aa = {{1,2,3}, {4,5,6}, {1,1,1}};
        
        int max = 0;
        int r=-1;
        for(int i=0; i<3; i++){
            int sum =0;
            for(int j=0; j<3; j++){
                sum+=aa[i][j];
            } 
            if(max<sum){
                max=sum;
                r=i;
            }
        } 

        System.out.println(r);

    }
}
