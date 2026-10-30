class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sumArray = new int[2];
        for(int i = 0; i< nums.length;i++){
            for(int j = i + 1; j< nums.length;j++){
                 if((nums[i]+nums[j]) == target){
                    sumArray[0] = i;
                    sumArray[1] = j;
                    return sumArray;
                 }
            }
        }
        return sumArray;
    }
}
