package dataStructure;

public class LinkedListJavaImpl<T> {
    public static void main(String[] args) {
        NodeJava<Integer> head = new NodeJava<>();
        head.addNode(10);
        head.addNode(20);
        head.addNode(30);
        head.addNode(40);
        head.addNode(50);

        System.out.println(head.toString());
    }
}

class NodeJava<T> {
    T data;
    NodeJava<T> next;

    NodeJava() {}

    NodeJava(T t) {
        this.data = t;
        this.next = null;
    }

    public void addNode(T t) {
        NodeJava<T> newNode = new NodeJava(t);
        NodeJava<T> temp = this;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NodeJava<T> temp = this;

        while (temp != null) {
            sb.append(temp.data);
            sb.append(' ');
            temp = temp.next;
        }
        return sb.toString();
    }
}
