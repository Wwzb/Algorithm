public class Sort {
    /**
     * 冒泡排序
     */
    public static void bubbleSort(long[] arr){
        long tmp = 0;//临时变量
        for(int i = 0;i < arr.length - 1;i++){//外层循环，表示次数
            for(int j = arr.length - 1;j > i;j--){//内层循环
                if(arr[j] < arr[j-1]){//交换数据，将小的换到前面
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    /**
     * 选择排序
     */
    public static void selectSort(long[] arr){
        int k = 0;
        long tmp = 0;
        for(int i = 0;i < arr.length - 1;i++){
            k = i;
            for(int j = i;j < arr.length;j++){
                if(arr[j] < arr[k]){
                    k = j;//将k指向最小的值的索引
                }
            }
            tmp = arr[i];//交换数据
            arr[i] = arr[k];
            arr[k] = tmp;
        }
    }

    /**
     * 插入排序
     */
    public static void insertSort(long[] arr){
        long tmp = 0;
        for(int i = 1;i < arr.length;i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]){
                tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
                j--;
            }
        }
    }
}
