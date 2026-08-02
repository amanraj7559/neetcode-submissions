class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){ 
                count++;
                continue;
            }
            prod*=nums[i];
        }
        int total=prod;
        for(int i=0;i<nums.length;i++){
            if(count>1){
                nums[i]=0;
            }
            else if(count==1 && nums[i]!=0){
                nums[i]=0;
                continue;
            }
            else if(nums[i]==0){
                nums[i]=prod;
                continue;
            }
            else{ 
                prod=total;
                prod=prod/nums[i];
            
                nums[i]=prod;
            }
            
        }
        return nums;
        
        
    }
}