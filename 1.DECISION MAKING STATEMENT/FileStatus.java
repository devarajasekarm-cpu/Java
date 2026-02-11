import java.io.File;

class FileStatus{
	void main(){
		String path = "C:/Users/HP/Desktop/Java/1.DCS/deva.txt";
		File file = new File(path);
		
		if(file.exists()){
			System.out.println("File exist");
		}
		else{
			System.out.println("File not exist");
		}
			
	}
	
}