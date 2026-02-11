class PassCal{

	void main(){
		int[] stu1 = {35,26,43,14,96};
		int passC = 0;
		int failC = 0;
		for(int i=0; i<stu1.length;i++){
			if((stu1[i]>=35) && (stu1[i]<=100)){
				passC +=1;
			}else if((stu1[i]>=0)&&(stu1[i]<35)){
				failC +=1;
			}else{
				System.out.println("Check your input");
			}
		}
		
		System.out.println(passC +" : your Pass subjects count");
		System.out.println(failC +" : Your fail subjects count");
	}
	
}
