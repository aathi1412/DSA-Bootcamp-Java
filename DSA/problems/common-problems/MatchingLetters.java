package leedcode;

public class pro1 {
     public static void main(String[] args) {

        String[] strs = {"flowers", "flow", "flight"}; 
        
        if( strs == null || strs.length == 0) return ;
        String pre = strs[0];
        int pre_len = pre.length();

        for(int i=1; i<strs.length; i++){
            String s = strs[i];
            while(pre_len > s.length() || !pre.equals(s.substring(0,pre_len)) ){
                pre_len --;
                if(pre_len == 0) return;
                pre = pre.substring(0, pre_len);
            }
        }
        System.out.println(pre);

    }
}

    

