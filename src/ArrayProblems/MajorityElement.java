package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    //Boyer Moore’s Voting Algorithm used for the N/2 problem;


//    for the n/2 problem;
//    while traversing
//    if(cnt == 0){
//       cnt = 1, ele = nums[i];
//    }
//    else if(ele == nums[i]) cnt++;
//    else cnt --;

//    for the n/3 problem
//    cnt1 = 0;
//    cnt2 = 0;
//    el1 = integer.min_value;
//    el2 = integer.min_value;
//
//    while traversing
//    if
//    cnt1 == 0 && nums[i] != el2
//    cnt1 = 1;
//    el1 = nums[i];
//
//    else if
//    cnt2 == 0 && nums[i] != el1;
//    cnt2 = 1;
//    el2 = nums[i];
//
//    else if
//    nums[i] == el1; cnt1++;
//
//    else if
//    nums[i] == el2; cnt2++;
//
//    else
//    cnt1--;cnt2--;

    public int getN2MajorityElement(int[] nums){
        int n = nums.length;
        int cnt = 0;
        int ele = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(cnt == 0){
                cnt = 1;
                ele = nums[i];
            }else if(nums[i] == ele) cnt++;
            else{
                cnt--;
            }
        }
        return ele;
    }

    int[] nums = {1,2,3,3,3,2,2,2};
    public List<Integer> getN3MajorityElement(int[] nums){
        int n = nums.length;
        int cnt1 = 0;
        int cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (cnt1 == 0 && num != el2) {
                cnt1 = 1;
                el1 = num;
            } else if (cnt2 == 0 && num != el1) {
                cnt2 = 1;
                el2 = num;
            }
            else if (num == el1) cnt1++;
            else if (num == el2) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }

        }

        cnt1 = 0; cnt2 = 0;
        for (int num : nums) {
            if (num == el1) cnt1++;
            if (num == el2) cnt2++;
        }

        List<Integer> result = new ArrayList<>();
        int mini = (int)(n/3) + 1;
        System.out.println(mini);
        if(cnt1>= mini) result.add(el1);
        if(cnt2>= mini) result.add(el2);

        return  result;
    }




}
