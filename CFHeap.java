package GenderMagP2;
import java.util.*;

public class CFHeap <T extends Comparable<T>> implements CFQueue<T> {
    private ArrayList<T> data;

    public CFHeap() {
        data = new ArrayList<T>();
    }

    public void addSong(T song) {
        data.add(song);
        int index = data.size() - 1;
        while (index > 0 && data.get(parent(index)).compareTo(data.get(index)) < 0) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public void deleteAll() {
        data.clear();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public T peekSong() {
        if (isEmpty()) {
            return null;
        }
        return data.get(0);
    }

    public void pushSong(T song) {
        addSong(song);
    }

    public T removeSong() {
        if (isEmpty()) {
            return null;
        }
        T root = data.get(0);
        data.set(0, data.get(data.size() - 1));
        data.remove(data.size() - 1);
        heapify(0);
        return root;
    }

    public int size() {
        return data.size();
    }

    private void heapify(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int largest = index;
        if (left < data.size() && data.get(left).compareTo(data.get(largest)) > 0) {
            largest = left;
        }
        if (right < data.size() && data.get(right).compareTo(data.get(largest)) > 0) {
            largest = right;
        }
        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private void swap(int i, int j) {
        T tmp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, tmp);
    }
    
    public static void main (String[] args) {
    	
    	//The Objects being made
    	CFHeap<String> songHeap = new CFHeap<>();
    	
    	songHeap.addSong("Angel");
		songHeap.addSong("Efecto");
		songHeap.addSong("Calabria_2008");
		songHeap.addSong("Photograph");
		songHeap.addSong("Crazy");
		songHeap.addSong("Te_Vas");
		songHeap.addSong("Outside");
		songHeap.addSong("Odiame");
		songHeap.addSong("Raydar");
		songHeap.addSong("In_The_End");
		songHeap.addSong("Sweden");
		songHeap.addSong("Cali_Panchangero");
		songHeap.addSong("Yesterday");
		songHeap.addSong("I_Ain't_Worried");
		songHeap.addSong("Mi_Viejo");
		songHeap.addSong("All_Off_Me");
		songHeap.addSong("Monster");
		songHeap.addSong("512");
		songHeap.addSong("Bobo");
		songHeap.addSong("Take_Care");
    	
		while (!songHeap.isEmpty()) {
		    System.out.println(songHeap.peekSong());
		    songHeap.removeSong();
		}
    }
}
