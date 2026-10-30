class Solution {
    public boolean hasDuplicate(int[] nums) {
        List aList  = new ArrayList();
        for(int i = 0; i< nums.length;i++){
            
            if(aList.contains(nums[i]))
            {
                return true;
            }else{
                aList.add(nums[i]);
            }
    
        }
        return false;
    }
}