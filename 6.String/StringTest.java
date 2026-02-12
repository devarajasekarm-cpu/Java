public class StringTest {

    static void main() {

        String s = "axc";
        String t = "ahbgdc";
        boolean contains = false;
        System.out.println(t.substring(0,t.length()).contains(String.valueOf(s.charAt(0))));
    }

}
