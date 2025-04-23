public class dutchNationalFlag {
    
    private static void sortArray(int array[]) {
        int len = array.length;
        int low = 0;
        int mid = 0;
        int high = len - 1;
        while(mid<=high) {
            if(array[mid] == 0) {
                swap(array,low,mid);
                low++;
                mid++;
            }else if(array[mid] == 1) {
                mid++;
            }else{
                swap(array,mid,high);
                high--;
            }
        }
    }

    private static void swap(int array[],int s1,int s2) {
        int temp = array[s1];
        array[s1] = array[s2];
        array[s2] = temp;
    }

    private static void display(int array[]) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int array[] = { 0, 1, 2, 0, 1, 2 };
        System.out.println("Array Before Sorting::");
        display(array);
        sortArray(array);
        System.err.println();
        System.out.println("Array After Sorting::");
        display(array);
    }
}
