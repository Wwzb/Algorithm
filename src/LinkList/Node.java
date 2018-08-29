package LinkList;

/**
 * 结点
 */
public class Node {
    public long data;//数据域
    public Node next;//指针域
    public Node(long value){
        this.data = value;
    }
    //显示方法
    public void display(){
        System.out.println(data + " ");
    }
}
