public class ReversePyramid {
    static void main() {

        int n=5;
        for(int i=0; i<5; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
