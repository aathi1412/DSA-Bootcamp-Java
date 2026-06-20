import java.util.*;
class substring {
  public static void main(String[] args) {
    String str = "feel pain know pain accept pain";
    string(str);
    stringbuild(str);
    stringbuff(str);
}

 static void string(String str) {
          //String str = "Hello, World!";
          String substr = str.substring(0, 9);
          System.out.println("Substring from String: " + substr);
      }
  
  

    static void stringbuild(String str) {
        StringBuilder sb = new StringBuilder(str);
        String substr = sb.toString().substring(10, 20);
        System.out.println("Substring from StringBuilder: " + substr);
    }



    static void stringbuff(String str) {
        StringBuffer sbf = new StringBuffer(str);
        String substr = sbf.toString().substring(0); 
        System.out.println("Substring from StringBuffer: " + substr);
    }
}


