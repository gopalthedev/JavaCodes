package work;
import work.QuickSort.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayPermutations arrayPermutations = new ArrayPermutations();

        int[] nums = {3,2,1};
        arrayPermutations.nextPermutaion(nums);
        for(int num: nums){
            System.out.print(num+" ");
        }
//        List<List<Integer>> result = new ArrayList<>();
//        arrayPermutations.permuteUsingNextPermutation(nums, result, new ArrayList<>());
//
//        result.stream().forEach(System.out::println);
    }
}