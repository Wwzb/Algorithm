package Sort;

/**
 * 快速排序
 */
public class QuickSort {
    public static void sort(long arr[],int low,int high){
        //递归出口
        if(low > high){
            return;
        }
        int i = low;
        int j = high;
        long key = arr[low];//关键数据
        while (i < j){
            while (i < j && arr[j] >key){//从右往左找到一个小于key的数
                j--;
            }
            while (i < j && arr[i] <= key){//从左往右找到一个大于key的数
                i++;
            }
            if(i < j){//交换左右两边的数
                long tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        //调整key的位置
        long tmp = arr[i];
        arr[i] = arr[low];
        arr[low] = tmp;
        sort(arr, low, i-1); //对key左边的数进行递归快排
        sort(arr,i+1 ,high ); //对key右边的数进行递归快排
    }
}
