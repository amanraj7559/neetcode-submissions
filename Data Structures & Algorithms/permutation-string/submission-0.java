class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int left=0;
        for(int right=0;right<s2.length();right++){
            char c=s2.charAt(right);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);

            }
            if(right-left+1==s1.length()){
                boolean found=true;
                for(int value:map.values()){
                    if(value!=0) found=false;
                }
                if(found) return true;
                char d=s2.charAt(left);
                if(map.containsKey(d)){
                    map.put(d,map.get(d)+1);
                    
                }
                left++;
            }
        }
        return false;
        
    }
}