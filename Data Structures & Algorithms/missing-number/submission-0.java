class Solution {
    public int missingNumber(int[] nums) {
        int n,tot_sum=0;
        int total=0;
        n=nums.length;
        tot_sum=(n*(n+1)/2);
        for(int num:nums)
        {
            total+=num;
        }
        return tot_sum-total;
    }
}
