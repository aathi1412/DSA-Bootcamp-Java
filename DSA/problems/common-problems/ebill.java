

import java.util.*;
public class ebill {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int unit = s.nextInt();

        System.out.println("Usage type : normal or commercial");
        s.nextLine();
        String type = s.nextLine();

        if(type.equalsIgnoreCase("normal") ){
            if(unit <= 100){
                System.out.println("The Units between 400 to 500 is free");
            }

            else if (unit <= 200) {
                System.out.println("The Units between 100 to 300 is 5rs per unit");
                System.out.println(" Ebill is :" + unit*5 + "rs");
            }

            else if(unit <= 300){
                System.out.println("The Units between 300 to 400 is 10rs per unit");
                System.out.println(" Ebill is :" + unit*10 + "rs");
            }

            else if(unit <= 400){
                System.out.println("AThe Units between 400 to 500  is 15rs per unit");
                System.out.println(" Ebill is :" + unit*15 + "rs");
            }
            
            else if(unit <= 500){
                System.out.println("Above 500units , 20rs per unit");
                System.out.println(" Ebill is :" + unit*20 + "rs");
            }


            
        }

        if(type.equalsIgnoreCase("commercial")){
           if(unit <= 100){
             System.out.println(" Ebill is :" + unit*10 + "rs");

           }
            else if (unit <= 200) {
                System.out.println("The Units between 200 to 300 is 5rs per unit");
                System.out.println(" Ebill is :" + unit*15 + "rs");
            }

            else if(unit <= 300){
                System.out.println("The Units between 300 to 400 is 10rs per unit");
                System.out.println(" Ebill is :" + unit*20 + "rs");
            }

            else if(unit <= 400){
                System.out.println("The Units between 400 to 500 is 15rs per unit");
                System.out.println(" Ebill is :" + unit*25 + "rs");
            }
            
            else if(unit <= 500){
                System.out.println("Above 500units , 20rs per unit");
                System.out.println(" Ebill is :" + unit*30 + "rs");
            }
        }
    }
    
}
