import java.util.Scanner;
import java.util.InputMismatchException;

class CheckStringIsEmpty{

	void main(){
		
			String input = null;
			
		try{
			//String input = user.nextLine();
			if(input.isBlank() ||input.isEmpty()){
				System.out.println("String is empty...");
			}else{
				System.out.println("String is not empty...");
			}
		}catch(NullPointerException e){
			System.out.println("String is Null...");
		}
	
	}

}