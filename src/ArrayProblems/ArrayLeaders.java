package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {

//    Problem Statement: Given an array, print all the elements which are leaders.
//    A Leader is an element that is greater than all of the elements on its right
//    side in the array.

    public List<Integer> leaders(int[] arr){
        int n = arr.length;
        int rightMostMax = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=n-1; i>=0; i--){
            if(arr[i] >= rightMostMax){
                list.add(0,arr[i]);
                rightMostMax = arr[i];
            }
        }
        return list;
    }

}
