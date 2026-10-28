class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int res1=1;
        arr[0]=1;
        
        for(int i=1;i<n;i++)
        {   
            res1=res1*nums[i-1];
            arr[i]=res1;
        }
        int pro=1;
        for(int i=n-2;i>=0;i--)
        {    pro*=nums[i+1];
            arr[i]=arr[i]*pro;
            
        }
       
        return arr;
        
    }
}  
