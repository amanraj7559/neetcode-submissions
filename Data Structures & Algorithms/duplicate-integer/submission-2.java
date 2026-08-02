class Solution {
    public boolean hasDuplicate(int[] nums) {

                HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;   // duplicate found
            }
            map.put(num, 1);
        }
        
        return false;

        
    }
}