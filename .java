package GenderMagP2;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class main{
	
	public static void main(String[] args) {
		
		//Creating 3 different song Objects
		Songs s1 = new Songs(8279426, "Angel ", "Shaggy ", "Hot Shot ", "2000 ");
		Songs s2 = new Songs(5178341, "Efecto ", "Bad Bunny ", "Un Verano Sin Ti ", "2022 ");
		Songs s3 = new Songs(6487135, "Calabria 2008 ", "Enur ", "Raggatronic ", "2008 ");		
		
		//Trying out toString
		System.out.println("Top 3 Songs on List With ID: \n(ID, Title, Artist, Album, Year)");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());	
		
		//LinkedList of the 3 songs made
		LinkedList<Songs> musicPlays = new LinkedList<>();
		musicPlays.add(s1);
		musicPlays.add(s2);
		musicPlays.add(s3);
		
		//Blank Space
		System.out.println();
		
		//Printing LinkedList
		System.out.println("3 Songs With No ID Number:");
		Songs.displayAllSongs(musicPlays);
		
		//Blank Space
		System.out.println();

		//File Path for ReadSongLinkedList and ReadSongArray
		String fileTest = "C:\\Kean_U\\Spring_2023\\Data_Structures\\GenderMag2\\output.txt";
		
		//Blank Space
		System.out.println();
		
		//Read() Method
		LinkedList<Songs> playList = Songs.readSongsLinkedList(fileTest);
		
		//Display
		Songs.displayAllSongs(playList);
		
		//Blank Space
		System.out.println();
		
		//Read() Method
		Songs[] MusicQueue = Songs.readSongsArray(fileTest);
		for(int i = 0; i < MusicQueue.length; i++) {
			System.out.println(MusicQueue[i].getAlbum());
		}
		
		//All Songs 
		List<Songs> songs = new ArrayList<>();
		songs.add(new Songs("","Angel", "Shaggy", "Hot Shot", "2000"));
		songs.add(new Songs("","Efecto", "Bad_Bunny", "Un_Verano_Sin_Ti", "2022"));
		songs.add(new Songs("","Calabria_2008", "Enur", "Raggatronic", "2008"));
		songs.add(new Songs("","Photograph", "Ed_Sheeran", "x", "2014"));
		songs.add(new Songs("","Crazy", "Aerosmith", "Get_A_Grip", "1993"));
		songs.add(new Songs("","Te_Vas", "Ozuna", "Te_Vas", "2017"));
		songs.add(new Songs("","Outside", "Bryson_Tiller", "Outside", "2022"));
		songs.add(new Songs("","Odiame", "Julio_Jaramillo", "El_Ruisenor_De_America", "1989"));
		songs.add(new Songs("","Raydar", "JID", "The_Forever_Story", "2022"));
		songs.add(new Songs("","In_The_End", "Linkin_Park", "Hybrid_Theory", "2000"));
		songs.add(new Songs("","Sweden", "C418", "Minecraft-Volume_Alpha", "2011"));
		songs.add(new Songs("","Cali_Panchangero", "Grupo_Niche", "The_Best", "1988"));
		songs.add(new Songs("","Yesterday", "The_Beatles", "Help!", "1965"));
		songs.add(new Songs("","I_Ain't_Worried", "OneRepublic", "I_Ain't_Worried", "2022"));
		songs.add(new Songs("","Mi_Viejo", "Piero", "Mi_Viejo", "1969"));
		songs.add(new Songs("","All_Off_Me", "John_Legend", "Love_In_The_Future", "2013"));
		songs.add(new Songs("","Monster", "Imagine_Dragons", "Smoke+Mirrors", "2015"));
		songs.add(new Songs("","512", "Mora", "Primer_Dia_De_Clases", "2021"));
		songs.add(new Songs("","Bobo", "J_Balvin", "Energia", "2016"));
		songs.add(new Songs("","Take_Care", "Drake", "Take_Care", "2011"));
		songs.add(new Songs("","Promise", "Romeo_Santos", "Formula_Vol.1", "2012"));
		songs.add(new Songs("","Godzilla", "Eminem", "Music_To_Be_Mudered_By", "2020"));
		songs.add(new Songs("","Riot", "Three_Days_Grace", "One-X", "2006"));
		songs.add(new Songs("","TUS_GAFITAS", "Karol_G", "MANANA_SERA_BONITO", "2023"));
		songs.add(new Songs("","Mbappe", "Eladio_Carrion", "Mbappe", "2023"));
		
		//X2 Same Songs
		songs.add(new Songs("","Angel", "Shaggy", "Hot Shot", "2000"));
		songs.add(new Songs("","Efecto", "Bad_Bunny", "Un_Verano_Sin_Ti", "2022"));
		songs.add(new Songs("","Calabria_2008", "Enur", "Raggatronic", "2008"));
		songs.add(new Songs("","Photograph", "Ed_Sheeran", "x", "2014"));
		songs.add(new Songs("","Crazy", "Aerosmith", "Get_A_Grip", "1993"));
		songs.add(new Songs("","Te_Vas", "Ozuna", "Te_Vas", "2017"));
		songs.add(new Songs("","Outside", "Bryson_Tiller", "Outside", "2022"));
		songs.add(new Songs("","Odiame", "Julio_Jaramillo", "El_Ruisenor_De_America", "1989"));
		songs.add(new Songs("","Raydar", "JID", "The_Forever_Story", "2022"));
		songs.add(new Songs("","In_The_End", "Linkin_Park", "Hybrid_Theory", "2000"));
		songs.add(new Songs("","Sweden", "C418", "Minecraft-Volume_Alpha", "2011"));
		songs.add(new Songs("","Cali_Panchangero", "Grupo_Niche", "The_Best", "1988"));
		songs.add(new Songs("","Yesterday", "The_Beatles", "Help!", "1965"));
		songs.add(new Songs("","I_Ain't_Worried", "OneRepublic", "I_Ain't_Worried", "2022"));
		songs.add(new Songs("","Mi_Viejo", "Piero", "Mi_Viejo", "1969"));
		songs.add(new Songs("","All_Off_Me", "John_Legend", "Love_In_The_Future", "2013"));
		songs.add(new Songs("","Monster", "Imagine_Dragons", "Smoke+Mirrors", "2015"));
		songs.add(new Songs("","512", "Mora", "Primer_Dia_De_Clases", "2021"));
		songs.add(new Songs("","Bobo", "J_Balvin", "Energia", "2016"));
		songs.add(new Songs("","Take_Care", "Drake", "Take_Care", "2011"));
		songs.add(new Songs("","Promise", "Romeo_Santos", "Formula_Vol.1", "2012"));
		songs.add(new Songs("","Godzilla", "Eminem", "Music_To_Be_Mudered_By", "2020"));
		songs.add(new Songs("","Riot", "Three_Days_Grace", "One-X", "2006"));
		songs.add(new Songs("","TUS_GAFITAS", "Karol_G", "MANANA_SERA_BONITO", "2023"));
		songs.add(new Songs("","Mbappe", "Eladio_Carrion", "Mbappe", "2023"));
		
		//Sort by Titles
		Collections.sort(songs, new NameComparator());
		System.out.println("Songs Sorted By Title (A-Z):");
		
		//Blank Space 
		System.out.println();
		
		for (Songs song : songs) {
			System.out.println(song.toString1());
		}
		
		//Blank Space 
		System.out.println();		
		
		//Sort by Years And Titles
		Collections.sort(songs, new YearNameComparator());
		System.out.println("Sorted By Year And Then Titles (Old To Recent): ");
		
		//Blank Space 
		System.out.println();
		
		for (Songs song : songs) {
			System.out.println(song.toString1());
		}

		//Blank Space 
		System.out.println();
		
		//Open File
		File filled = new File("C:\\Kean_U\\Spring_2023\\Data_Structures\\GenderMag2\\song.txt");
		
		try {
			//Read File
			Scanner scanner = new Scanner(filled);

			//Search The song
			System.out.print("Enter a song title: ");
			Scanner titledSearch = new Scanner(System.in);
			String SongName = titledSearch.nextLine();		
		
			// Search Through Data
			while (scanner.hasNextLine()) {
				String section = scanner.nextLine();
				String[] point = section.split(",");
				String title = point[0];
				String artist = point[1];
				String albumName = point[2];
				String year = point[3];

			if (title.equalsIgnoreCase(SongName)) {
				System.out.println("Title: " + title);
				System.out.print(", Artist: " + artist);
				System.out.print(", Album: " + albumName);
				System.out.print(", Year: " + year);
				System.out.println();
				
				}
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found: " + filled.getName());
		}	
		
		// Open File
		File AllSongs = new File("C:\\Kean_U\\Spring_2023\\Data_Structures\\GenderMag2\\song.txt");

		//Input by year and name
		System.out.print("Enter a Year or Song Title: ");
		Scanner YearOrTitle = new Scanner(System.in);
		String NumOrName = YearOrTitle.nextLine();

		// Search for songs that match the user's input
		try {
			Scanner Skimming = new Scanner(AllSongs);
			while (Skimming.hasNextLine()) {
				String songLine = Skimming.nextLine();
				String[] songData = songLine.split(",");
				String songTitle = songData[0];
				String songArtist = songData[1];
				String songAlbum = songData[2];
				String songYear = songData[3];

				// Check if the song matches the user's search term
				if (songYear.equals(NumOrName) || songTitle.equalsIgnoreCase(NumOrName)) {
					System.out.printf("%s by %s (%s, %s)%n", songTitle, songArtist, songAlbum, songYear);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Failed to read song file: " + e.getMessage());
		}		
		
	}
	
}
