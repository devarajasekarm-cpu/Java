class Login{
	
	void main(){
			
		String pw = "3214";
		
		try{
			if((pw.equalsIgnoreCase("true"))||(pw.equalsIgnoreCase("false"))){
				if(pw.equals("true")){
					System.out.println("Login Successfull...");
				}else{
					System.out.println("Incorrect Password...");
				}
			}else{
				throw new IllegalArgumentException("Make sure correct input format");
			}
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
	
}