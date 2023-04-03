package GenderMagP2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

//Finds Song.txt and Updates it 
public class SongSelections{
	
	public static void main(String[] args) {
		//Creating the song.txt
		String input = "C:\\Kean_U\\Spring_2023\\Data_Structures\\GenderMag2\\song.txt";
		String output = "C:\\Kean_U\\Spring_2023\\Data_Structures\\GenderMag2\\song.txt";
		processSongs(input, output);
		System.out.println("Roger");
		
	}

	//Updating it
	private static void processSongs(String input, String output) {
		
		try (BufferedReader read = new BufferedReader(new FileReader(input)); FileWriter write = new FileWriter(output)){
			String section;
			boolean isFirstSection = true;
			Random random = new Random();
			
			while ((section = read.readLine()) != null) {
				if (isFirstSection) {
					isFirstSection = false;
					write.write("SongID," + section + System.lineSeparator());
					
				} else if (!section.trim().isEmpty()) {
					int randomId = random.nextInt(8999999) + 1000000;
					write.write(randomId + "," + section + System.lineSeparator());
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
