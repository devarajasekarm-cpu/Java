class Menu{
	
	void main(){
		String str = "read";
		
			switch(str){
				case "add":
					System.out.println("Item added");
					break;
				case "read":
					System.out.println("Item Reading");
					break;
				case "update":
					System.out.println("Item updated");
					break;
				case "delete":
					System.out.println("Item deleted");
					break;
				default :
					System.out.println("CRUD");
			}
		}
		
	}