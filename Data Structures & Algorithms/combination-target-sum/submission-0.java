class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        fun(nums,nums.length,0,target,new ArrayList<>());
        return res;
        
    }
    void fun(int nums[],int n,int i,int target,List<Integer> list)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        if(i>=n ||target<0)
        {
            return ;
        }
        list.add(nums[i]);
        fun(nums,n,i,target-nums[i],list);
        list.remove(list.size()-1);
        fun(nums,n,i+1,target,list);
    }
}
