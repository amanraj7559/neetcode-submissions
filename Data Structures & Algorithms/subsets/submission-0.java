class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,nums,new ArrayList<>(),ans);
        return ans;      
    }
    public static void helper(int index,int[] nums,List<Integer> subset,List<List<Integer>> ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        helper(index+1,nums,subset,ans);

        int element=nums[index];
        subset.add(element);
        helper(index+1,nums,subset,ans);
        subset.remove(subset.size() - 1);
    }

}