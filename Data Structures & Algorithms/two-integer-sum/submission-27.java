class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> foundValue = new HashMap<>();
        
        for(int i = 0; i< nums.length;i++){
             int difference = target - nums[i];
             if(foundValue.containsKey(difference)){
                return new int[]{foundValue.get(difference),i};
             }
             foundValue.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
