import java.util.*;
public class twosums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The length of the array: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        // insert values into the array
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        findTwoSum(arr,target);
        sc.close();
    }
    private static int[] findTwoSum(int[] arr,int target) {
        // 2 7 11 15   targ = 9
        int res[] = new int[2];
        //using two for loops
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                int tar = arr[i] + arr[j];
                if(tar == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        for(int k : res) {
            System.out.println(k);
        }
        return res;
    }
}