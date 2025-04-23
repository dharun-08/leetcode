import java.util.*;
// bubble sort
/* Bubble sort is the simplest sorting algorithm that works by repeatedly swapping the 
 * adjacent element if they are in wrong order
 */
public class bubblesort {
    public static void main(String[] args) {
        System.out.println("*****Bubble Sort*****");
        int n = 5;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[n];
        System.out.println("Enter the "+n+" Elements to the array!");
        for(int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The Elements before Sorting");
        display(array);
        // implementing bubble sort
        bubbleSort(array);
        System.out.println("The Elements After Bubble Sort");
        display(array);
        sc.close();
    }
    private static void bubbleSort(int[] array) {
        int len = array.length;
        for(int i=0; i<len-1;i++) {
            for(int j=0;j<len-i-1;j++) {
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    private static void display(int[] array) {
        int len = array.length;
        for(int i=0;i<len;i++) {
            System.out.print(array[i]+" ");
        }
    }
}
