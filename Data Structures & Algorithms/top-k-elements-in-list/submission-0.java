class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        

        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else{
                map.put(num,1);
            }
        }
        int[] result = new int[k];
        for(int i=0;i<k;i++){

            int maxKey = 0;
            int maxValue = 0;

            for(int key : map.keySet()){
                if(map.get(key) > maxValue){
                    maxValue = map.get(key);
                    maxKey = key;
                }
            }

            result[i] = maxKey;

            map.remove(maxKey);
        }

        return result;
        
        
    }
}