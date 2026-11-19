class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int k=i;
            int tot=0;
            while(k!=0)
            { tot++;
            k=k&(k-1);
            }
            arr[i]=tot;
        }
        return arr;

        
    }
}
