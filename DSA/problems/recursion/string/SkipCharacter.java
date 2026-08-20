package string;

public class SkipCharacter {
    public static void main(String[] args) {
        String s = "abacapplecadacapp";
        String sb = skipAppNotApple(s);
        System.out.println(sb);
    }

    public static String pureSkipCharacter(String s) {
        if(s.isEmpty()) return "";

        char ch = s.charAt(0);
        if(ch == 'a') return pureSkipCharacter(s.substring(1));
        else return ch + pureSkipCharacter(s.substring(1));
    }

    public static void skipCharacter(String s, int i, StringBuilder sb) {
        if(i == s.length()) return;

        if(s.charAt(i) != 'a') sb.append(s.charAt(i));
        skipCharacter(s, i+1, sb);
    }

    public static String skipApple(String s) {
        if(s.isEmpty()) return "";

        if(s.startsWith("apple")) return skipApple(s.substring(5));
        else return s.charAt(0) + skipApple(s.substring(1));
    }

    public static String skipAppNotApple(String s) {
        if(s.isEmpty()) return "";

        if(s.startsWith("app") && !s.startsWith("apple")) return skipAppNotApple(s.substring(3));
        else return s.charAt(0) + skipAppNotApple(s.substring(1));
    }

}
