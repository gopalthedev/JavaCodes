package ArrayProblems;

public class MaximumProductSubArray {
//    Given the array arr return the array with maximum product.

    public int maxSubArray(int[] arr){
        int n = arr.length;
        int prod1 = arr[0], prod2 = arr[0], result = arr[0];
        for(int i=1; i<n; i++){
            int temp = Math.max(arr[i], Math.max(arr[i]*prod1, arr[i]*prod2));
            prod2 = Math.min(arr[i], Math.min(arr[i]*prod1, arr[i]*prod2));
            prod1 = temp;
            result = Math.max(result, prod1);
        }
        return result;
    }
}
