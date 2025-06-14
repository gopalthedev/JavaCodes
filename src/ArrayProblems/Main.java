package ArrayProblems;

import javax.sound.midi.SysexMessage;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2};
        int k = 2;


       CountSubArraySumEqualsK cs = new CountSubArraySumEqualsK();
        System.out.println(cs.subarraySum(nums, k));

    }
}