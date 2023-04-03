package GenderMagP2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Songs<T> extends SongSelections{
	//Data Fields needed
	private T songID;
	private T title;
	private T artist;
	private T album;
	private T year;
	
	//Default Constructor
	public Songs() {
	}	
	
	//Overloaded Constructor
	public Songs(T title, T artist, T album, T year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
		}
	
	//Overloaded Constructor
	public Songs(T songID, T title, T artist, T album, T year) {
		this.songID = songID;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}

	
	//Setters and Getters
	public T getSongsID() {
		return songID;
	}

	public void setSonsgID(T songID) {
		this.songID = songID;
	}

	public T getTitle() {
		return title;
	}

	public void setTitle(T title) {
		this.title = title;
	}

	public T getArtist() {
		return artist;
	}

	public void setArtist(T artist) {
		this.artist = artist;
	}

	public T getAlbum() {
		return album;
	}

	public void setAlbum(T album) {
		this.album = album;
	}

	public T getYear() {
		return year;
	}

	public void setYear(T year) {
		this.year = year;
	}

	
	//toString method
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s", songID, title, artist, album, year);

	} 
	
	
	//Displaying 1st 3 data types in the song list
	public static void displayAllSongs(LinkedList<Songs> songList) {
		for (Songs song : songList) {
			System.out.println(song.getTitle() + " " + song.getArtist() + " " + song.getAlbum());
		}
	}
	
	
	//LinkedList
	public static LinkedList<Songs> readSongsLinkedList(String filePath){
		LinkedList<Songs> playlist = new LinkedList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] songData = line.split(",");
				String id = songData[0].trim();
				String title = songData[1].trim();
				String artist = songData[2].trim();
				String album = songData[3].trim();
				String year = songData[4].trim();
				playlist.add(new Songs(id, title, artist,album, year));
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return playlist;
	}
	
	
	//Array
	public static Songs[] readSongsArray(String filePath) {
		LinkedList<Songs> playlist = new LinkedList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String section;
			while ((section = br.readLine()) != null) {
				String[] songData = section.split(",");
				String id = songData[0].trim();
				String title = songData[1].trim();
				String artist = songData[2].trim();
				String album = songData[3].trim();
				String year = songData[4].trim();
				playlist.add(new Songs(id, title, artist,album, year));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return playlist.toArray(new Songs[0]);
	}

	
	//SearchSong() Name
	public static void searchSongs(String songName, Songs[] songsArray) {
		
        ArrayList<Songs> SearchTitles = new ArrayList<Songs>();
        for (Songs song : songsArray) {
        	String title1 = (String) song.title; 
			System.out.println(title1);   
            }
        }
	
	
	//SearchSong() Year and Name
	public static void searchSongs(int year, String songName, Songs[] songsArray) {
		
		ArrayList<Integer> searchYears = new ArrayList<Integer>();
		for(Songs songTwo : songsArray) {
			String yearTwo = (String) songTwo.year; 
			System.out.println(yearTwo);
		}
		
		//Spacing
		System.out.print("\n");

		for(Songs song : songsArray) {
			String title = (String) song.title;
			System.out.println(title);
		}
	}

	
	//toString() for while compared
	public String toString1() {
		return title + " by \"" + artist + "\"" + year;
	}  
}

//Comparing by Name
class NameComparator implements Comparator<Songs> {
	@Override
	public int compare(Songs song1, Songs song2) {
		return ((String) song1.getTitle()).compareTo((String) song2.getTitle());
	}
}


//Comparing by Year and Name 
class YearNameComparator implements Comparator<Songs> {
	@Override
	public int compare(Songs song1, Songs song2) {
		return ((String) song1.getYear()).compareTo((String) song2.getYear());
	}
}
