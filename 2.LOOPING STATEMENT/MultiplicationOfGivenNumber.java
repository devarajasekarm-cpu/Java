public class MultiplicationOfGivenNumber {
    static void main() {
        int n = 50;
        for(int i=1; i<n/2; i++){
            if((n%i)==0) {
                System.err.print(i +", ");
            }
        }
    }
}
