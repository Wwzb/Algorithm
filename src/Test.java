
import Sort.QuickSort;
import Sort.ShellSort;

public class Test {
    public static void main(String[] args) {
        long arr[] = {1,63,5,13,34,54,22,86,36,50};
        System.out.print("[ ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
        QuickSort.sort(arr, 0, arr.length-1);
        System.out.print("[ ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
}