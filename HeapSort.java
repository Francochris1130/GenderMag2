package GenderMagP2;
import java.util.*;


public class HeapSort {
  /** Heap sort method */
  public static <E> void heapSort(E[] list) {
    // Create a Heap of integers
    heapSort(list, (e1, e2) -> ((Comparable<E>)e1).compareTo(e2));
  }
  
  /** Heap sort method */
  public static <E> void heapSort(E[] list, Comparator<E> c) {
    // Create a Heap of integers
    Heap<E> heap = new Heap<>(c);

    // Add elements to the heap
    for (int i = 0; i < list.length; i++)
      heap.add(list[i]);

    // Remove elements from the heap
    for (int i = list.length - 1; i >= 0; i--)
      list[i] = heap.remove();
  }

  /** A test method */
  public static void main(String[] args) {
    String[] list = {"Angel","Efecto", "Calabria_2008", "Photograph", "Crazy", "Te_Vas", "Outside", "Odiame", "Raydar", "In_The_End", "Sweden", "Cali_Panchangero", "Yesterday",
    		"I_Ain't_Worried", "Mi_Viejo", "All_Off_Me", "Monster", "512", "Bobo", "Take_Care"}; 
    heapSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.println(list[i] + " ");
  }
}
