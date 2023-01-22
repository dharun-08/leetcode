class Solution{
  //pivotPoint Function()
  public int pivotPoint(int[] arr){
    //find the length of the array
    int length = arr.length;
    //return 0 if only one element in the array;
    if(arr.length==1){
      return 0;
    }
    //create left pivot array
    int[] leftPivotArray = new int[length];
    //create right pivot array
    int[] rightPivotArray = new int[length];
    //sum leftPivotArray
    leftPivotArray[0] = arr[0];
    for(int i=1;i<length;i++{
      leftPivotArray[i] = leftPivotArray[i-1] + nums[i];
    }
        //sum rightPivotArray
    rightPivotArray[length-1] = arr[length-1];
    for(int i=length-2;i>=0;i++){
      rightPivotArray[i] = rightPivotArray[i+1] + nums[i];
    }
     
        //check where the index get same;
     for(int j=0;j<length;j++){
      if(leftSumArray[j]==rightSumArray[j]){
          return j;
      }
     }
        return -1;
  }
  
  public static void main(String args[]) {
    int[] arr = [1,7,3,6,5,6];
    System.out.println(pivotPoint(arr));
  }
}
