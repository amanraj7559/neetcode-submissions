class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr=new int[temperatures.length];
        Stack<Integer> s=new Stack<>();
        s.push(0);
        for(int i=1;i<arr.length;i++){
              while(!s.isEmpty()&&temperatures[i]>temperatures[s.peek()]){
                int indx=s.pop();
                arr[indx]=i-indx;
              } 
              
            s.push(i);
                                            
        }
        return arr;
        
    }
}