import BinarySearch.*;


public class Main {
    public static void main(String[] args) {
        DCapacity dCapacity = new DCapacity();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int days = 1;
        System.out.println(dCapacity.shipWithinDays(nums, days));
    }
}