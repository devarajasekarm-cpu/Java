public class ZigZag {
    static void main() {

        int n=7;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j || j==(n+1-i)){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
