package ArrayProblems;

import javax.sound.midi.SysexMessage;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};
       threeSum.triplets(nums).forEach(System.out::println);

    }
}