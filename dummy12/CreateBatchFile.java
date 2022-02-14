import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

class CreateBatchFile {

	public static void main (String [] args) {
		try {
      		File myObj = new File("Batch List Sample.txt");
      		if (!myObj.exists()) {
				myObj.createNewFile();
			}
			FileWriter myWriter = new FileWriter(myObj);
			for (int i = 1; i <= 1000; i++) {
				myWriter.write("C:\\Users\\developer\\Downloads\\large-repo-test\\TestFile" + i + ".txt\t1024\t1\n");
			}
      			
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
			
    	} catch (IOException e) {
      		System.out.println("An error occurred.");
      		e.printStackTrace();
    	}
	}
}