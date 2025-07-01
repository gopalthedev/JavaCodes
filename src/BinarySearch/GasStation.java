package BinarySearch;

public class GasStation {
//    Problem Statement: You are given a sorted array ‘arr’ of length ‘n’, which contains
//    positive integer positions of ‘n’ gas stations on the X-axis. You are also given an
//    integer ‘k’. You have to place 'k' new gas stations on the X-axis. You can place them
//    anywhere on the non-negative side of the X-axis, even on non-integer positions. Let 'dist'
//    be the maximum value of the distance between adjacent gas stations after adding k new gas stations.
//    Find the minimum value of ‘dist’.
//
//    Note: Answers within 10^-6 of the actual answer will be accepted. For example, if the actual
//    answer is 0.65421678124, it is okay to return 0.654216. Our answer will be accepted if that is
//    the same as the actual answer up to the 6th decimal place.

    public double minimizeMaxDist(int[] arr, int k){
        int n = arr.length;
        int maxDiff = Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            maxDiff = Math.max(maxDiff, arr[i] - arr[i-1]);
        }

        double start = 0;
        double end = maxDiff;

        while((end-start) > 0.000001){
            double mid = start + (end-start)/2;

            int no_of_stations = findStations(arr, mid);
            if(no_of_stations > k){
                start = mid;
            }else{
                end = mid;
            }
        }

        return end;
    }

    private int findStations(int[] arr, double dist){
        int n = arr.length;
        int count = 0;
        for(int i=1; i<n; i++){
            int no_of_station = (int) ((arr[i] - arr[i-1]) / dist);
            if(arr[i]-arr[i-1] == dist*no_of_station){
                no_of_station--;
            }
            count += no_of_station;
        }
        return count;
    }
}
