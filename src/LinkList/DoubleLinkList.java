package LinkList;

public class DoubleLinkList {
    private Node first;
    private Node last;
    public DoubleLinkList(){
        first = null;
        last = null;
    }
    //在头节点之前插入一个结点
    public void insertFirst(long value){
        Node node = new Node(value);
        if(isEmpty()){
            last = node;
        }else {
            first.previous = node;
        }
        node.next = first;
        first = node;
    }
    //在尾节点之后插入一个结点
    public void insertLast(long value){
        Node node = new Node(value);
        if(isEmpty()){
            first = node;
        }else {
            last.next = node;
            node.previous = last;
        }
        last = node;
    }
    //在头结点删除一个结点
    public Node deleteFirst(){
        if(first.next == null){
            last =null;
        }else {
            first.next.previous = null;
        }
        first = first.next;
        return first;
    }
    //从尾部删除一个结点
    public Node deleteLast(){
        if(first.next == null){
            first = null;
        }else {
            last.previous.next = null;
        }
        last = last.previous;
        return last;
    }
    //显示方法
    public void display(){
        Node current = first;
        while (current != null){
            current.display();
            current = current.next;
        }
        System.out.println();
    }
    //查找方法
    public Node find(long value){
        Node current = first;
        while (current.data != value){
            if(current.next == null){
                return null;
            }
            current = current.next;
        }
        return current;
    }
    //根据数据域进行删除
    public Node deleteByData(long value){
        if(first == null){//如果链表为空则直接返回空
            return null;
        }
        Node current = first;//当前结点
        Node previous = null;//前一个结点
        while (current != null){
            if(current.data == value){
                while(current.next != null && current.next.data ==value){
                    current = current.next;
                }
                if(previous == null){
                    first = current.next;
                }else {
                    previous.next = current.next;
                }
            }else {
                previous = current;
            }
            current = current.next;
        }
        return first;
    }
    //计算链表长度
    public long length(){
        long count = 1;
        Node current = first;
        while(current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public boolean isEmpty(){
        return first == null;
    }
}
