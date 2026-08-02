class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,ans,new ArrayList<>());
        return ans;                
    }
    public static void helper(int[] nums,int start,List<List<Integer>> ans,List<Integer> subset){
            ans.add(new ArrayList<>(subset));
            
        
        for (int i = start; i < nums.length; i++) {
        if(i>start&& nums[i]==nums[i-1]) continue;
         subset.add(nums[i]);

            helper(nums,i+1,ans,subset);
        subset.remove(subset.size() - 1);
        }
        
    }
}