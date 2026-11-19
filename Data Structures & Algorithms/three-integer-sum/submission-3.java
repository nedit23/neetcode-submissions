class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int low=0;
        int high=n-1;
        for(int k=0;k<n-2;k++)
        {   
            if( k>0 && nums[k]==nums[k-1])
        {
            continue;

        }
            int a1=nums[k];
            int i=k+1;
             int j=n-1;

            while(i<j)
            {
                if(a1+nums[i]+nums[j]==0)
                {
                    List<Integer> r1=new ArrayList<>();
                    r1.add(a1);
                    r1.add(nums[i]);
                    r1.add(nums[j]);
                    res.add(r1);
                    i++;
                    j--;
                    while(i<j && nums[i]==nums[i-1])
                    {
                        i++;
                    
                    }
                    while(i<j && nums[j]==nums[j+1])
                    {
                        j--;
                    
                    }
                }
                    else if(a1+nums[i]+nums[j]>0)
                    {
                        j--;
                    }
                    else
                    {
                        i++;

                    }

                }
            }
            return res;
            
        }
        
        
    }
