class TernaryOpe{
	
	void main(){
		
		int a = 45;
		int b = 13;
		int age = 11;
		int mark = 22;
		boolean button = false;
		System.out.println("Greater No Is : " + ((a>b)?a:b));
		System.out.println("You Are : " + (((age>0)&&(age<=18))?"MINOR":"ADULT"));
		System.out.println((mark<35)?"FAIL":"PASS");
		System.out.println((button==true)?"ON":"FALSE");
	
	}

}