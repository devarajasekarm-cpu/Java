public class FloydTriangle {
    static void main() {

        int n=5;
        int in=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(in++ +" ");
            }
            System.out.println();
        }

    }
}
