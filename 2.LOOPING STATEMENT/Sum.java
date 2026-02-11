import java.util.InputMismatchException;
import java.util.Scanner;

 public class Sum {

    static void main() {
        Scanner user = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter the number (0 to stop)");
            try {
                int input = user.nextInt();
                    if (input == 0) {
                        break;
                    }
                    sum += input;
            }
            catch(InputMismatchException e){
                System.out.println("Invalid please enter right value");
                user.next();
            }
        }
        System.out.println(sum);
    }
}
