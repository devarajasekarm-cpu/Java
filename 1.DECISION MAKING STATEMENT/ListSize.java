class ListSize{
	void main(){
		int arr[] = new int[0];
		
		try{
			if(arr.length!=0){
				try{
					for(int i=0; i<=arr.length; i++){
						System.out.print(arr[i] +",");
					}
				}catch (ArrayIndexOutOfBoundsException e){
					System.out.println("\nOut of memory");
				}
			}else{
				throw new IllegalArgumentException("Array is Empty");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}