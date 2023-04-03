package GenderMagP2;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main{
	
	public static void main(String[] args) {
		
		//Creating 3 different song Objects
		Songs s1 = new Songs(3408724, "Angel ", "Shaggy ", "Hot Shot ", "2000 ");
		Songs s2 = new Songs(4226609, "Efecto ", "Bad Bunny ", "Un Verano Sin Ti ", "2022 ");
		Songs s3 = new Songs(8154507, "Calabria 2008 ", "Enur ", "Raggatronic ", "2008 ");		
		
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
		
		//Read() Method
		LinkedList<Songs> playList = Songs.readSongsLinkedList(fileTest);
		
		//Display
		Songs.displayAllSongs(playList);
		
		System.out.println();
		
		//Read() Method
		Songs[] MusicQueue = Songs.readSongsArray(fileTest);
		for(int i = 0; i < MusicQueue.length; i++) {
			System.out.println(MusicQueue[i].getAlbum());
		}
		
		//All Songs 
		List<Songs> songs = new ArrayList<>();
		songs.add(new Songs("3408724","Angel", "Shaggy", "Hot Shot", "2000"));
		songs.add(new Songs("4226609","Efecto", "Bad_Bunny", "Un_Verano_Sin_Ti", "2022"));
		songs.add(new Songs("8154507","Calabria_2008", "Enur", "Raggatronic", "2008"));
		songs.add(new Songs("9093296","Photograph", "Ed_Sheeran", "x", "2014"));
		songs.add(new Songs("6201873","Crazy", "Aerosmith", "Get_A_Grip", "1993"));
		songs.add(new Songs("6357522","Te_Vas", "Ozuna", "Te_Vas", "2017"));
		songs.add(new Songs("9871499","Outside", "Bryson_Tiller", "Outside", "2022"));
		songs.add(new Songs("5488371","Odiame", "Julio_Jaramillo", "El_Ruisenor_De_America", "1989"));
		songs.add(new Songs("2524636","Raydar", "JID", "The_Forever_Story", "2022"));
		songs.add(new Songs("9342657","In_The_End", "Linkin_Park", "Hybrid_Theory", "2000"));
		songs.add(new Songs("5561015","Sweden", "C418", "Minecraft-Volume_Alpha", "2011"));
		songs.add(new Songs("3013922","Cali_Panchangero", "Grupo_Niche", "The_Best", "1988"));
		songs.add(new Songs("8682926","Yesterday", "The_Beatles", "Help!", "1965"));
		songs.add(new Songs("8575184","I_Ain't_Worried", "OneRepublic", "I_Ain't_Worried", "2022"));
		songs.add(new Songs("8028384","Mi_Viejo", "Piero", "Mi_Viejo", "1969"));
		songs.add(new Songs("7303769","All_Off_Me", "John_Legend", "Love_In_The_Future", "2013"));
		songs.add(new Songs("9115126","Monster", "Imagine_Dragons", "Smoke+Mirrors", "2015"));
		songs.add(new Songs("3545278","512", "Mora", "Primer_Dia_De_Clases", "2021"));
		songs.add(new Songs("9126987","Bobo", "J_Balvin", "Energia", "2016"));
		songs.add(new Songs("2127881","Take_Care", "Drake", "Take_Care", "2011"));
		songs.add(new Songs("2081393","Promise", "Romeo_Santos", "Formula_Vol.1", "2012"));
		songs.add(new Songs("7522232","Godzilla", "Eminem", "Music_To_Be_Mudered_By", "2020"));
		songs.add(new Songs("4064250","Riot", "Three_Days_Grace", "One-X", "2006"));
		songs.add(new Songs("1909091","TUS_GAFITAS", "Karol_G", "MANANA_SERA_BONITO", "2023"));
		songs.add(new Songs("7688756","Mbappe", "Eladio_Carrion", "Mbappe", "2023"));
		
		//X2 Same Songs
		songs.add(new Songs("4308934","Angel", "Shaggy", "Hot Shot", "2000"));
		songs.add(new Songs("4236690","Efecto", "Bad_Bunny", "Un_Verano_Sin_Ti", "2022"));
		songs.add(new Songs("5815470","Calabria_2008", "Enur", "Raggatronic", "2008"));
		songs.add(new Songs("9912369","Photograph", "Ed_Sheeran", "x", "2014"));
		songs.add(new Songs("7028137","Crazy", "Aerosmith", "Get_A_Grip", "1993"));
		songs.add(new Songs("5635743","Te_Vas", "Ozuna", "Te_Vas", "2017"));
		songs.add(new Songs("7101918","Outside", "Bryson_Tiller", "Outside", "2022"));
		songs.add(new Songs("3382316","Odiame", "Julio_Jaramillo", "El_Ruisenor_De_America", "1989"));
		songs.add(new Songs("3521692","Raydar", "JID", "The_Forever_Story", "2022"));
		songs.add(new Songs("9421274","In_The_End", "Linkin_Park", "Hybrid_Theory", "2000"));
		songs.add(new Songs("1650152","Sweden", "C418", "Minecraft-Volume_Alpha", "2011"));
		songs.add(new Songs("6108546","Cali_Panchangero", "Grupo_Niche", "The_Best", "1988"));
		songs.add(new Songs("7317150","Yesterday", "The_Beatles", "Help!", "1965"));
		songs.add(new Songs("7751548","I_Ain't_Worried", "OneRepublic", "I_Ain't_Worried", "2022"));
		songs.add(new Songs("1531675","Mi_Viejo", "Piero", "Mi_Viejo", "1969"));
		songs.add(new Songs("3985680","All_Off_Me", "John_Legend", "Love_In_The_Future", "2013"));
		songs.add(new Songs("2428493","Monster", "Imagine_Dragons", "Smoke+Mirrors", "2015"));
		songs.add(new Songs("5042208","512", "Mora", "Primer_Dia_De_Clases", "2021"));
		songs.add(new Songs("5420967","Bobo", "J_Balvin", "Energia", "2016"));
		songs.add(new Songs("9913477","Take_Care", "Drake", "Take_Care", "2011"));
		songs.add(new Songs("6782564","Promise", "Romeo_Santos", "Formula_Vol.1", "2012"));
		songs.add(new Songs("8907649","Godzilla", "Eminem", "Music_To_Be_Mudered_By", "2020"));
		songs.add(new Songs("1164939","Riot", "Three_Days_Grace", "One-X", "2006"));
		songs.add(new Songs("8092268","TUS_GAFITAS", "Karol_G", "MANANA_SERA_BONITO", "2023"));
		songs.add(new Songs("4098618","Mbappe", "Eladio_Carrion", "Mbappe", "2023"));
		
		//Blank Space 
		System.out.println();		
		
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
				String id = point[0];
				String title = point[1];
				String artist = point[2];
				String albumName = point[3];
				String year = point[4];

			if (title.equalsIgnoreCase(SongName)) {
				System.out.println();
				System.out.print("ID: " + id);
				System.out.print(", Title: " + title);
				System.out.print(", Artist: " + artist);
				System.out.print(", Album: " + albumName);
				System.out.print(", Year: " + year);
				System.out.println();
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

		//Match the user's input
		try {
			Scanner Skimming = new Scanner(AllSongs);
			while (Skimming.hasNextLine()) {
				String songLine = Skimming.nextLine();
				String[] songData = songLine.split(",");
				String songId = songData[0];
				String songTitle = songData[1];
				String songArtist = songData[2];
				String songAlbum = songData[3];
				String songYear = songData[4];

				//Match the user's input
				if (songYear.equals(NumOrName) || songTitle.equalsIgnoreCase(NumOrName)) {
					System.out.println();
					System.out.print("ID: " + songId);
					System.out.print(", Title: " + songTitle);
					System.out.print(", Artist: " + songArtist);
					System.out.print(", Album: " + songAlbum);
					System.out.print(", Year: " + songYear);
					System.out.println();
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Failed to read song file: " + e.getMessage());
		}		
		
	}
	
}
