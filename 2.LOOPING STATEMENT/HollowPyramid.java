public class HollowPyramid {
    static void main() {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                if(j==1||i==n||j==i) {
                    System.out.print(j+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
