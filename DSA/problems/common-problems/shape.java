import java.util.*;
class shape{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter shape");
        String a =s.nextLine();

        if( a.equalsIgnoreCase("1" )){
            System.out.println("area or perimeter");
            String ar=s.nextLine();
            
            if(ar.equalsIgnoreCase("area")){
               int area = s.nextInt();
                  int ss=square(area);
                  System.out.println(ss);
            }
            else if(ar.equalsIgnoreCase("perimeter")){
               int perimeter=s.nextInt();
            }
        }
        else{
            System.out.println("invalid");
        }
        
  

    }

    public static int square(int side){
         int squ= side*side;
         int pp = side*2;
          return pp;
    }

    /*public static int rect(int area){

    }*/

    
}