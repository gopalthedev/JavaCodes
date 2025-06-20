package ArrayProblems;

import java.util.ArrayList;

public class MissingAndRepeating {
//    Given an unsorted array arr of positive integers. One number a from the set
//    [1, 2,....,n] is missing and one number b occurs twice in the array. Find numbers a and b.
//
//        Note: The test cases are generated such that there always exists one
//    missing and one repeating number within the range [1,n].

    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        long n = arr.length;
        long Sn = n*(n+1)/2;
        long Sn2 =n*(n+1)*(2*n+1)/6;
        long S = 0;
        long S2 = 0;
        for(int i=0; i<n; i++){
            S += (long)arr[i];
            S2 += (long)arr[i]*(long)arr[i];
        }
        ArrayList<Integer> result = new ArrayList<>();

        long X = Sn-S + (Sn2-S2)/(Sn-S);
        X = X/2;
        long Y = X -Sn + S;
        result.add((int)Y);
        result.add((int)X);

        return result;
    }
}
