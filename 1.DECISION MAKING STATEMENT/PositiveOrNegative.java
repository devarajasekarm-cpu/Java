import java.util.Scanner;
import java.util.InputMismatchException;

class PositiveOrNegative{
	
	void main(){
	
		// Getting input from user
		Scanner user = new Scanner(System.in);
		System.out.println("Enter number to know it positive or negative... ?");
		int input = 0;
		// Catch Exception
		try{
			input = user.nextInt();
		}catch(InputMismatchException eh){
			System.out.println("Please enter valid Input...");
			new PositiveOrNegative().main();
		}
		// Decision Control Logic
		if(input<0){
			// -
			System.out.println("This is Negative Number...");
		}else if(input>0){
			// +
			System.out.println("This is Positive Number...");
		}else{
			//0
			System.out.println("This is neutral Number...");
		}
		
	}
	
}