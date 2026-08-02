class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            char[] a=word.toCharArray();
            Arrays.sort(a);
            String s=new String(a);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(word);

            
        }
        return new ArrayList<>(map.values());
        
    }
}