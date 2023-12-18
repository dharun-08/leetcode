class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int ans = 0;
        int flag = 0;
        for(int i=0;i<len;i++) {
            if(nums[i] == target || nums[i] > target) {
                ans = i;
                flag = 1;
                break;
            } else if(i==len-1 && flag ==0) {
                ans = i+1;
                
            }
        }
        return ans;
    }
}
