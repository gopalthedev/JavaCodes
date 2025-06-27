import BinarySearch.*;


public class Main {
    public static void main(String[] args) {
        PainterPartition pp  = new PainterPartition();
        int[] nums = {10,20,30,40};
        int k = 2;
        System.out.println(pp.painterPartition(nums, k));
    }
}