import java.util.*;
class fact{
    
  int sum(int n){
    int rev=1;
    while(n!=0){
    int digit=n%10;
   // rev*=10+digit;
    n/=10;
    }
    return rev;
  }
  
  int numfact(int rev){
    int res=1;
    for(int i=1;i<=rev;i++){
    res*=i;
    
    }
    return res;
    
  }
public static void main(String[] args){

  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  fact obj=new fact();
  int rev=obj.sum(n);
  int fac=obj.numfact(rev);
  //int temp=n;
  if(rev==fac){
    //System.out.println("strong");
  }
  System.out.println(rev);
}

}
