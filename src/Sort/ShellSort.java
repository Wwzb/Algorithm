package Sort;

/**
 * 希尔排序
 */
public class ShellSort {
    //排序方法
    public static void sort(long arr[]){
        for(int gap = arr.length / 2;gap > 0;gap = gap / 2){//设定间隔和间隔递减
            for(int i = gap;i < arr.length;i++){//进行插入排序
                int j = i;
                long tmp = arr[j];
                if(arr[j] < arr[j-gap]){
                    while (j - gap >= 0 && tmp < arr[j-gap]){
                        arr[j] = arr[j-gap];
                        j-=gap;
                    }
                    arr[j] = tmp;
                }
            }
        }
    }
}
