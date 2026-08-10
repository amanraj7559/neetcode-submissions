class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int fre[]=new int[26];
        int maxFreq=0;
        int maxWin=0;
        for(int right=0;right<s.length();right++){
            fre[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,fre[s.charAt(right)-'A']);
            maxWin=right-left+1;
            if(maxWin-maxFreq>k){
                fre[s.charAt(left)-'A']--;
                left++;
            }
            int max=right-left+1;
            maxWin=Math.max(max,fre[s.charAt(right)-'A']);


        }
        return maxWin;
        
    }
}