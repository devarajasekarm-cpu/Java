class AddBonusOnSalary{
	
	//input & check
	void main(String[] args){
		
		try{
			int salary = Integer.parseInt("-324324");
			if((salary>=50000) && (salary<=700000)){
				System.out.println("Bonus Added" + addBonus(salary));
			}
			else if(((salary>=20000) && (salary<500000)) || ((salary>70000) && (salary<=150000))){
				System.out.println("Bonus not afflicable");
			}else{
				throw new IllegalArgumentException("Invalid salary");
			}
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
	}
	
	//Evaluate and Output
	int addBonus(int salary){
		return salary + ((salary/100) *10);
	}
}
