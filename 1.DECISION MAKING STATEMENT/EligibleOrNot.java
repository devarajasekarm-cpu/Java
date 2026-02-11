import java.util.Scanner;
import java.util.InputMismatchException;

class EligibleOrNot{

	void main(){
	
		// Getting Input
		Scanner user = new Scanner(System.in);
		System.out.println("Enter Your Age to Know Your Are Eligible Or Not!!!");
		int input = 0;
		// Error Handling
		try{
			input = user.nextInt();
		}catch(InputMismatchException e){
			System.out.println("Please Enter Valid Input...");
			return;
		}
		//Evaluate
		if(input>0&&input<18){
			//Not Eligible
			System.out.println("You are not ELigible...");
		}else if(input>18&&input<=100){
			//Eligible
			System.out.println("You are Eligible for voting...");
		}else{
			//Not Valid
			System.out.println("Invalid Age...");
		}
		
	}
	
}