class Solution {
    public int maxSubArray(int[] nums) {
        int cur_tot=nums[0];
        int max_tot=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            cur_tot=Math.max(nums[i],cur_tot+nums[i]);
            max_tot=Math.max(cur_tot,max_tot);
        }
        return max_tot;
    }
}
