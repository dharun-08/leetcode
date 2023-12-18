class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        int j = 0;
        for(int i=len-1;i>=0;i--) {
            if(j!=nums2.length) {
                nums1[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
        for(int k:nums1) {
            System.out.print(k+" ");
        }
    }
}
