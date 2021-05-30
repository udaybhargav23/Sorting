public static int[] implementMergeSort(int arr[], int start, int end)
    {
        // Your code here
       // You can have your own function where you will use 
      // start and end position for divide purpose  
      if (start<end){
          int m = start + ((end-start)/2);
          implementMergeSort(arr,start,m);
          implementMergeSort(arr,m+1,end);
          sort(arr,start,m,end);
      }
      return arr;
    }
public static void sort(int arr[],int s, int m, int e){
    int l = m-s+1;
    int r = e-m;
    int [] L = new int[l];
    int [] R = new int[r];
    for (int i=0;i<l;i++){
        L[i]=arr[s+i];
    }
    for (int i=0;i<r;i++){
        R[i]=arr[m+1+i];
    }
    int i=0, j=0, k=s;
    while (i<l && j<r){
        if (L[i]<R[j]){
            arr[k]=L[i];
            i+=1;
        }else{
            arr[k]=R[j];
            j+=1;
        }
        k+=1;
    }
    while (i<l){
        arr[k]=L[i];
        i+=1;
        k+=1;
    }
    while (j<r){
        arr[k]=R[j];
        j+=1;
        k+=1;
    }
}
