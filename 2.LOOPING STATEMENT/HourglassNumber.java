public class HourglassNumber {
    static void main() {

        int n=5;
        // top
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // bottom
        for(int i=2; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
