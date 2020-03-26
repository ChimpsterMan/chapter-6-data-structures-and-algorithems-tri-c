//import java.util.Math;

public class NumberSort {
  public static void main(String args[]) {
    int listLength = 100;
    int[] numList = new int[listLength];
    
    //initialize the list with random values
    for (int i = 0; i < numList.length; i++){
      numList[i] = (int) (Math.random() * listLength * 10);
      System.out.print(numList[i] + ",");
    }
    
    System.out.println();
    
    //sort and print the list
    int[] newList = MergeSort.mergeSort(numList);
    for (int i = 0; i < newList.length; i++){
      System.out.print(newList[i] + ",");
    }
  }
}