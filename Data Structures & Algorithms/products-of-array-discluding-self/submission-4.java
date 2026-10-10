class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int prefix=1;
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            prefix*=nums[i-1];
            ans[i]=prefix;
        }
        int suff=1;
        for(int i=nums.length-2;i>=0;i--){
            suff*=nums[i+1];
            ans[i]*=suff;
        }
        
        return ans;       
    }
}