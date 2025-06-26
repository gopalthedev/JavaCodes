package BinarySearch;

public class MBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if(n < m*k) return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : bloomDay){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }


        int start = min;
        int end = max;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            int cnt = nob(mid, bloomDay, k);
            if(cnt >= m){
                ans = mid;
                end = mid-1;
            }else if(cnt < m){
                start = mid+1;
            }

        }
        return ans;

    }

    public int nob(int h, int[] bloomDay, int k){
        int n = bloomDay.length;

        int cnt = 0;
        int flower = 0;
        for(int i=0; i<n; i++){
            if(bloomDay[i] <= h){
                flower++;
                if(flower==k){
                    cnt++;
                    flower=0;
                }
            }else{
                flower=0;
            }
        }
        return cnt;
    }
}
