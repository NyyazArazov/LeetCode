class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    backtrackSum(list, new ArrayList<>(), nums, target, 0);
    return list;
}


private void backtrackSum(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
    
    if(remain < 0) return;
    
    else if(remain == 0) list.add(new ArrayList<>(tempList));

    else{ 
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrackSum(list, tempList, nums, remain - nums[i], i);
            tempList.remove(tempList.size() - 1);
        }
    }
}
}
