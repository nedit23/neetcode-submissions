class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> res=new HashSet<>();
        int i=0;
        int j=0;
        int len=0;
        while(j<s.length())
        { char ch=s.charAt(j);
            while(res.contains(ch))
            {
              
                res.remove(s.charAt(i));
                i++;
            }
            res.add(ch);
            len=Math.max(len,j-i+1);
            j++;

        }
        return len;
        
    }
}
