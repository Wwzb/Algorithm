package BinaryTree;

/**
 * 二叉树
 */
public class BinaryTree {
    public Node root;

    //插入结点
    public void insert(long value) {
        //封装结点
        Node newNode = new Node(value);
        Node current = root;
        Node parent;
        if (root == null) {
            root = newNode;
            return;
        } else {
            while (true) {
                parent = current;
                if (current.data > value) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    //查找结点
    public Node find(long value) {
        //引用当前结点，从根结点开始
        Node current = root;
        while (current.data != value) {
            if (current.data > value) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    //删除结点
    public boolean delete(long value) {
        //引用当前结点，从根结点开始
        Node current = root;
        //引用当前结点的父结点
        Node parent = root;
        boolean isLeftChild = true;
        while (current.data != value) {
            parent = current;
            if (current.data > value) {
                current = current.leftChild;
                isLeftChild = true;
            } else {
                current = current.rightChild;
                isLeftChild = false;
            }
            if (current == null) {
                return false;
            }
        }
        //删除叶子结点
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } else if (current.rightChild == null) {
            if(current == root){
                root = current.leftChild;
            }else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.leftChild == null) {
            if(current == root){
                root = current.rightChild;
            }else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        }else {
            Node successor = getSuccessor(current);
            if(current == root){
                root = successor;
            }else if(isLeftChild){
                parent.leftChild = successor;
            }else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return true;
    }
    public Node getSuccessor(Node delNode){
        Node successor = delNode;
        Node successorParent = delNode;
        Node current = delNode.rightChild;
        while (current != null){
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if(successor != delNode.rightChild){
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }
    //先序遍历
    public void frontOrder(Node localNode){
        if(localNode != null){
            System.out.println(localNode.data);
            frontOrder(localNode.leftChild);
            frontOrder(localNode.rightChild);
        }
    }
    //中序遍历
    public void inOrder(Node localNode){
        if(localNode != null){
            inOrder(localNode.leftChild);
            System.out.println(localNode.data);
            inOrder(localNode.rightChild);
        }
    }
    //后序遍历
    public void afterOrder(Node localNode){
        if(localNode != null){
            afterOrder(localNode.leftChild);
            afterOrder(localNode.rightChild);
            System.out.println(localNode.data);
        }
    }
}
