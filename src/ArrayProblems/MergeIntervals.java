package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
//    Given an array of intervals where intervals[i] = [starti, endi], merge all
//    overlapping intervals, and return an array of the non-overlapping intervals
//    that cover all the intervals in the input.

    public int[][] merge(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
        int n = intervals.length;

        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);
        List<Integer> first = new ArrayList<>();
        first.add(intervals[0][0]);
        first.add(intervals[0][1]);
        list.add(first);

        for (int i = 1; i < n; i++) {
            List<Integer> last = list.getLast();
            if (intervals[i][0] <= last.get(1)) {
                int a = Math.min(last.get(0), intervals[i][0]);
                int b = Math.max(last.get(1), intervals[i][1]);
                List<Integer> temp = List.of(a, b);
                list.removeLast();
                list.add(temp);
            } else {
                List<Integer> temp = List.of(intervals[i][0], intervals[i][1]);
                list.add(temp);
            }
        }

        int m = list.size();
        int[][] ans = new int[m][2];
        for (int i = 0; i < m; i++) {
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        return ans;
    }
}
