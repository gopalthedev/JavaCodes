package ArrayProblems;

import javax.sound.midi.SysexMessage;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-31, -48, -90, 54, 20, 95, 6, -86, 22};
       LargestSubarrayWithZeroSum lsa = new LargestSubarrayWithZeroSum();
        System.out.println(lsa.maxLength(nums));


    }
}