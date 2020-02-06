package testUserCredits;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
	

	public static void main(String filename) throws IOException {
		String fileName = "D:\\"+filename+".txt";
		Path path = Paths.get(fileName);
		List<String> readAllLines  =  Files.readAllLines(path);
		for(String Line : readAllLines)
		{
			System.out.println(Line);
		}
	
	}
	
}
