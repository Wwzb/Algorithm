/**
 * 栈
 * 底层实现是一个数组
 */
public class Stack {
    private long[] arr;
    private int top;
    //默认构造方法
    public Stack(){
        arr = new long[10];
        top = -1;
    }
    //有参构造方法
    public Stack(int maxsize){
        arr = new long[maxsize];
        top = -1;
    }
    //添加数据
    public void push(int value){
        arr[++top] = value;
    }
    //移除数据
    public long pop(){
        return arr[top--];
    }
    //查看数据
    public long peek(){
        return arr[top];
    }
    //判断是否为空
    public boolean isEmpty(){
        return top == -1;
    }
    //判断是否已满
    public boolean isFull(){
        return top == arr.length - 1;
    }
}