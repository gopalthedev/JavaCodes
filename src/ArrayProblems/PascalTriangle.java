package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

//                1
//              1   1
//            1   2   1
//          1   3   3   1

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        pascal.add(temp);

        for(int i=1; i<numRows; i++){
            List<Integer> lastRow = pascal.getLast();
            List<Integer> currRow = new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j == 0){
                    currRow.add(lastRow.getFirst());
                }
                else if(j == i){
                    currRow.add(lastRow.getLast());
                }else{
                    currRow.add(lastRow.get(j-1) + lastRow.get(j));
                }
            }
            pascal.add(currRow);
        }
        return pascal;
    }
}
