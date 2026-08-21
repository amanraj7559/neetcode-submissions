class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int rem=0;
        for(int i=0;i<nums.length;i++){
            rem=target-nums[i];
            if (map.containsKey(rem)) return new int[]{map.get(rem),i};
            map.put(nums[i],i);
        }   
        return new int[]{-1,-1};     
    }
}