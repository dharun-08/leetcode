// My Solution
class Solution {
    public int[] getThreeLargest(int arr[]) {
        // code here
        int[] result = removeDuplicates(arr);
        int prev = Integer.MIN_VALUE;
        Arrays.sort(result);
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i=result.length-1;i>=0 && count < 3; i--) 
        {
            if(result[i]!=prev) 
            {
                prev = result[i];
                list.add(prev);
                count++;
            }
        }
        int ans[] = new int[list.size()];
        int c = 0;
        for(int i: list){
            ans[c] = i;
            c++;
        }
        return ans;
    }
    private static int[] removeDuplicates(int arr[]) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr) 
        {
            set.add(num);
        }
        int result[] = new int[set.size()];
        int i = 0;
        for(int num : set) 
        {
            result[i] = num;
            i++;
        }
        return result;
    }
}

// Optimal solution
import java.util.*;

public class Main {
    // Function to return three largest elements
    public static List<Integer> get3largest(int[] arr) {
        int fst = Integer.MIN_VALUE, sec = Integer.MIN_VALUE, thd = Integer.MIN_VALUE;

        for (int x : arr) {
            // If current element is greater than fst
            if (x > fst) {
                thd = sec;
                sec = fst;
                fst = x;
            }
            // If x is between fst and sec
            else if (x > sec && x != fst) {
                thd = sec;
                sec = x;
            }
            // If x is between sec and thd
            else if (x > thd && x != sec && x != fst) {
                thd = x;
            }
        }

        List<Integer> res = new ArrayList<>();
        if (fst == Integer.MIN_VALUE) return res;
        res.add(fst);
        if (sec == Integer.MIN_VALUE) return res;
        res.add(sec);
        if (thd == Integer.MIN_VALUE) return res;
        res.add(thd);

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        List<Integer> res = get3largest(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
