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
        int res2=1;
        for(int i=n-1;i>=0;i--)
        {    arr[i]=arr[i]*res2;
            res2=res2*nums[i];
            
        }
       
        return arr;
        
    }
}  
