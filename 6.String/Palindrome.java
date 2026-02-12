public class Palindrome {

    static void main() {

        String s="was it a car or a cat i saw?";

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        int end = s.length()-1;
        int start = 0;

        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)){
                System.out.println(false);
            }
        }

        System.out.println(true);
    }

}
