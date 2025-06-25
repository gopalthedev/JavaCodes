package BinarySearch;

public class KOKOBananas {
//    Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
//    The guards have gone and will come back in h hours.
//
//    Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile
//    of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all
//    of them instead and will not eat any more bananas during this hour.
//
//    Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
//
//    Return the minimum integer k such that she can eat all the bananas within h hours.

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxBanana = Integer.MIN_VALUE;


        for (int pile : piles) {
            maxBanana = Math.max(pile, maxBanana);
        }

        int start = 1;
        int end = maxBanana;
        int k = Integer.MAX_VALUE;

        while(start <= end){
            int mid = start + (end-start)/2;

            int calculatedHours = calH(mid, piles);
            if(calculatedHours <= h){
                k = Math.min(k, mid);
                end = mid-1;
            }else if(calculatedHours > h){
                start = mid+1;
            }
        }

        return k;

    }

    public int calH(int k, int[] piles){
        int h = 0;
        for (int pile : piles) {
            h += Math.ceilDiv(pile, k);
        }
        return h;
    }
}
