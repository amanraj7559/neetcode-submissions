class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int[] arr=new int[256];
        int left=0;
        for(int right=0;right<s.length();right++){
            char a=s.charAt(right);
            while(arr[a]==1){
                arr[s.charAt(left)]=0;
                left++;
            }
            arr[a]=1;
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}