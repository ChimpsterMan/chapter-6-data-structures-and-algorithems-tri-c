public class MergeSort {
  public MergeSort(){
    
  }
  
  public static int[] mergeSort(int[] list){
    //System.out.println("merge sort");
    if (list.length <= 1){
      return list;
    }
    
    int[] left = new int[list.length/2];
    int[] right = new int[list.length-list.length/2];
    
    //left list adding
    for (int i = 0; i < list.length/2; i++){
      left[i] = list[i];
    }
    //right list adding
    for (int i = 0; i < list.length-list.length/2; i++){
      right[i] = list[i + list.length/2];
    }
    
    //recursive sort
    left = mergeSort(left);
    right = mergeSort(right);
    
    //merge sorted lists
    return merge(left,right);
  }
  
  public static int[] merge(int[] left, int[] right){
    //System.out.println("merge");
    int[] mergedList = new int[left.length + right.length];
    
    int leftCount = 0;
    int rightCount = 0;
    
    //System.out.println("while left right");
    while (leftCount < left.length && rightCount < right.length){
      if (left[leftCount] <= right[rightCount]){
        mergedList[leftCount + rightCount] = left[leftCount];
        leftCount += 1;
      }
      else {
        mergedList[leftCount + rightCount] = right[rightCount];
        rightCount += 1;
      }
    }
    
    //System.out.println("left");
    while (leftCount < left.length){
      mergedList[leftCount + rightCount] = left[leftCount];
      leftCount += 1;
    }
    
    //System.out.println("right");
    while (rightCount < right.length){
      mergedList[leftCount + rightCount] = right[rightCount];
      rightCount += 1;
    }

    return mergedList;
  }
}

/*while (leftCount < left.length || rightCount < right.length){
      if (leftCount < left.length && left[leftCount] <= right[rightCount]){
        mergedList[leftCount + rightCount] = left[leftCount];
        leftCount += 1;
      }
      else if (rightCount < right.length){
        mergedList[leftCount + rightCount] = right[rightCount];
        rightCount += 1;
      }
    }
    */