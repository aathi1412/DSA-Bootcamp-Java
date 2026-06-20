import java.util.*;
public class pan {
    public static void main(String []arrgs)
    {
        Scanner ss=new Scanner(System.in);
        int n=ss.nextInt();
        if(abundant(n)&&pronic(n)&&niven(n)){
            System.out.print("all the three are true");
        }
        else if(abundant(n)&&pronic(n)){
        System.out.print("abundant and pronic");
        }
        else if(abundant(n)&&niven(n))
        {
            System.out.print("adundant and niven");
        }
        else if(niven(n)&&pronic(n)){
            System.out.print(" niven and pronic");
        }
        else if(abundant(n)){
            System.out.print("abundant only");
            }
            else if(niven(n))
            {
                System.out.print("niven only");
            }
            else if(pronic(n)){
                System.out.print("pronic only");
            }
            else {
                System.out.print("not");
            }
        ss.close();
    } 
    static boolean pronic(int n){
        boolean var=false;
        for(int i=1;i<n;i++)
        {
            if(i*(i+1)==n){
                return true;
            }
        }
        return var;
    }
    static boolean abundant(int n){
        int sum=0;
         for(int i=1;i<n;i++){
              if(n%i==0){
                sum+=i;
              }                   
         }
         if(sum>n){
            return true;
         }
         return false;     
    }
    static boolean niven(int n){
        int num=n,count=0,sum=0;
        while(num!=0){
             num/=10;
             count++;
        }
        num=n;
        for(int i=0;i<count;i++){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        if(n%sum==0){
            return true;
         }
         return false;
}
}
