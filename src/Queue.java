/**
 * 队列
 * 底层是一个数组
 */
public class Queue {
    private long[] arr;
    private int elements;//有效数据的大小
    private int front;//队列的头
    private int end;//队尾

    public Queue(){
        arr = new long[10];
        elements = 0;
        front = 0;
        end = -1;
    }
    public Queue(int maxsize){
        arr = new long[maxsize];
        elements = 0;
        front = 0;
        end = -1;
    }
    //从队尾添加数据
    public void insert(long value){
        if(end == arr.length - 1){
            end = -1;
        }
        arr[++end] = value;
        elements++;
    }
    //从队头删除数据
    public long remove(){
        long value = arr[front++];
        if(front == arr.length){
            front = 0;
        }
        elements--;
        return value;
    }
    //从队头查看数据
    public long peek(){
        return arr[front];
    }
    //判断是否为空
    public boolean isEmpty(){
        return elements == 0;
    }
    //判断是否已满
    public boolean isFull(){
        return elements == arr.length;
    }
}
