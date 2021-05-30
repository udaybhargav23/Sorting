/*
// Information about the arguments given in function
arr[]: input array
start: starting index of array
end: ending index of array
*/
public static int[] quickSort(int arr[], int start, int end)
{
       // Your code here
      // You can create your own helper function
      int pivot = divide(arr,start,end);
      if (start < pivot-1){
            quickSort(arr,start,pivot-1);
      }
      if (pivot<end){
            quickSort(arr,pivot,end);
      }
      //Arrays.sort(arr);
      return arr;     
}
public static int divide(int arr[],int start, int end){
      int pivot = (arr[start]+arr[end])/2;
      while (start<=end){
            while (arr[start]<pivot){
                  start+=1;
            }
            while (arr[end]>pivot){
                  end-=1;
            }
            if (start<=end){
                  int temp = arr[start];
                  arr[start]=arr[end];
                  arr[end]=temp;
                  start+=1;
                  end-=1;
            }
      }
      return start;
}
