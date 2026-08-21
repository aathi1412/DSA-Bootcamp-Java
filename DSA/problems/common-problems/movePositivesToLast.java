package Arrays.Arrays1D;

import java.util.Arrays;

public class movePositivesToLast {
    public static void main(String[] args) {
        int[] a = {1,-2,3,4,-5,8,-11,13};
        int n = a.length;
        int[] pos = new int[a.length];
        int[] neg = new int[a.length];
        int left =0;
        int right = 0;

        for(int i=0; i<n; i++){
            
            if(a[i] < 0){
                neg[left++] = a[i]; 
            }
            else{
                pos[right++] = a[i];
            }
        }
        right = 0;
        while(left < n){
            neg[left++] = pos[right++];
        }

        System.out.println(Arrays.toString(neg));

        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
    }
}
