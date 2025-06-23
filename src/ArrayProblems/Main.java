package ArrayProblems;

import BinarySearch.BinarySearchOnSortedArray;
import BinarySearch.ImplementLowerBound;
import BinarySearch.ImplementUpperBound;

import javax.sound.midi.SysexMessage;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,4,6,7,9,10,15,18,20,40,50};
        ImplementUpperBound lb = new ImplementUpperBound();

        System.out.println(lb.upperBound(nums, 9));


    }
}