import java.util.List;

class TestException{
	
	void main() throws NullPointerException{
		List<Integer> list = null;
		
		try{
			if(list==null){
				throw new NullPointerException("List is Null");
			}
		}catch(NullPointerException e){
			System.err.println(e.getMessage());
		}
	}
	
}