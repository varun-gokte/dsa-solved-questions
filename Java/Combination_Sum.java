import java.util.*;
class Combination_Sum
{
    List<List<Integer>> answer = new ArrayList<List<Integer>>();

    List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        combinations(candidates,target,0,0,new Stack<Integer>());
        return answer;
    }

    void combinations (int[]arr,int targ, int i,int sum, Stack<Integer> list)
    {
        if (sum==targ)
        {
            List<Integer> cloned_list = new ArrayList<Integer>(list);
            answer.add(cloned_list);
            return;
        }
        else if (i>=arr.length || sum>targ)
            return;
        else
        {
            list.push(arr[i]);
            combinations (arr,targ,i,sum+arr[i],list);
            list.pop();
            combinations(arr,targ,i+1,sum,list);
        }
    }
}