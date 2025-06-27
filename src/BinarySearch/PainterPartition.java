package BinarySearch;

public class PainterPartition {
//    Problem Statement: Given an array/list of length ‘N’, where the array/list represents the
//    boards and each element of the given array/list represents the length of each board. Some
//    ‘K’ numbers of painters are available to paint these boards. Consider that each unit of a board
//    takes 1 unit of time to paint. You are supposed to return the area of the minimum time to get this
//    job done of painting all the ‘N’ boards under the constraint that any painter will only paint the
//    continuous sections of boards.

    public int painterPartition(int[] boards, int k){
        int start = Integer.MIN_VALUE;
        int end = 0;
        for(int num : boards){
            start = Math.max(start, num);
            end+= num;
        }
        int ans = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end-start)/2;

            int no_of_painters = findPartitions(boards, mid);
            if(no_of_painters <= k){
                ans = Math.min(ans, mid);
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }
        return ans;
    }

    public int findPartitions(int[] boards, int time){
        int count = 1;
        int currentTime = 0;
        for(int num : boards){
            if(currentTime + num > time){
                count++;
                currentTime = num;
            }else{
                currentTime +=num;
            }
        }
        System.out.println("For "+ time + " number of boards : " + count);
        return count;
    }
}
