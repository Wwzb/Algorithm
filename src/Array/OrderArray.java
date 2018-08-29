package Array;

/**
 * 有序数组
 */

public class OrderArray {
    private long[] arr;
    private int elements;//有效数据的长度
    public OrderArray(){
        arr = new long[50];//默认构造方法，设定初始长度为50
    }
    public OrderArray(int maxsize){
        arr = new long[maxsize];//有参构造方法，传入数组的最大长度
    }
    /**
     * 添加数据
     */
    public void insert(long value){
        int i;
        for(i = 0;i < elements;i++){
            if(arr[i] > value){
                break;
            }
        }

        for(int j = elements;j > i;j--){
            arr[j] = arr[j - 1];//插入位置后面的数据后移一位
        }
        arr[i] = value;
        elements++;
    }
    /**
     * 显示数据
     */
    public void display(){
        System.out.print("[ ");
        for(int i = 0;i<elements;i++){
            System.out.print(arr[i]+" ");//循环输出数组内容
        }
        System.out.println("]");
    }
    /**
     * 根据数值返回索引
     */
    public int search(long value){
        int i;
        for(i = 0;i < elements;i++){
            if(arr[i] == value){
                break;
            }
        }
        if(i == elements){
        return -1;//若不存在，返回-1
    }else {
        return i;//若存在，返回索引
    }
    }
    /**
     * 根据索引返回数据
     */
    public long get(int index){
        if(index >= elements || index < 0){//判断索引的合法性
            throw new ArrayIndexOutOfBoundsException();//若索引大于数组长度或者小于0，则抛出数组越界异常
        }else {
            return arr[index];//否则返回该数据
        }
    }
    /**
     * 删除数据
     */
    public void delete(int index){
        if(index >= elements || index < 0){//判断索引的合法性
            throw new ArrayIndexOutOfBoundsException();//若索引大于数组长度或者小于0，则抛出数组越界异常
        }else {
            for(int i = index;i < elements;i++){
                arr[index] = arr[index+1];
            }
            elements--;
        }
    }
    /**
     * 更新数据
     */
    public void update(int index,int newvalue){
        if(index >= elements || index < 0){//判断索引的合法性
            throw new ArrayIndexOutOfBoundsException();//若索引大于数组长度或者小于0，则抛出数组越界异常
        }else {
            arr[index] = newvalue;
        }
    }
    /**
     *二分法查找
     */
    public int binarySearch(long value){
        int middle;
        int low = 0;
        int pow = elements;
        while (true){
            middle = (pow + low) / 2;
            if(arr[middle] == value){
                return middle;
            }else if(low > pow){
                return -1;
            }else {
                if(arr[middle] > value){
                    pow = middle - 1;
                }else {
                    low = middle + 1;
                }
            }
        }
    }
}
