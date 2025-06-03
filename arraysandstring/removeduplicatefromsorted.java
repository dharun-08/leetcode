// my solution
class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        HashSet<Integer> set = new HashSet<>();
        int len = arr.length;
        int idx = 0;
        for(int i=0;i<len;i++) {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
}

//optimal
class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        HashSet<Integer> set = new HashSet<>();
        int len = arr.length;
        int idx = 0;
        for(int i=0;i<len;i++) {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
}
