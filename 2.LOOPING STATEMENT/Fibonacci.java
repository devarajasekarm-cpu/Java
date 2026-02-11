public class Fibonacci {
    static void main() {
        int a = 0;
        int b = 1;
        for(int i=1; i<=5; i++){
            int c = a+b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}
