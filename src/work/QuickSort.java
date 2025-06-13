package work;

public class QuickSort {
    public void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex-1);

            quickSort(arr, pivotIndex+1, high);
        }
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[low];

        int i = low;
        int j = high;

        while(arr[i] <= pivot && i<=high-1){
            i++;
            while(arr[j]> pivot  && j>=low){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
