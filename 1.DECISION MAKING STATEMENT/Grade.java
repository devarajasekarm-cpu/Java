class Grade{

	void main(){
		int mark = 7;
		
		if(mark<35){
			System.out.println("Fail");
		}else if((mark>=35)&&(mark<=60)){
			System.out.println("D");
		}else if((mark>=60)&& (mark<=75)){
			System.out.println("c");
		}else if((mark>75)&&(mark<=90)){
			System.out.println("B");
		}else {
			System.out.println("A");
		}
	}

}