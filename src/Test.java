import LinkList.LinkList;

public class Test {
    public static void main(String[] args) {
        LinkList linkList1 = new LinkList();
        linkList1.insertAfterFirst(1);
        linkList1.insertAfterFirst(3);
        linkList1.insertAfterFirst(2);
        linkList1.insertAfterFirst(3);
        linkList1.insertAfterFirst(3);
        linkList1.insertAfterFirst(4);
        linkList1.insertAfterFirst(3);
        linkList1.insertAfterFirst(5);
        linkList1.insertAfterFirst(3);
        linkList1.insertAfterFirst(3);
        linkList1.display();
        linkList1.deleteByData(3);
        linkList1.display();
        System.out.println("length:"+linkList1.length());
    }
}
