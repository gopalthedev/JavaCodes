import BinarySearch.*;

import java.io.FileDescriptor;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[][] mat = {
                {10},
                {21},
                {7}
        };

        FindPeakGrid findPeakGrid = new FindPeakGrid();
        int[] ans = findPeakGrid.findPeakGrid(mat);
        System.out.println(ans[0] + " " + ans[1]);
    }
}