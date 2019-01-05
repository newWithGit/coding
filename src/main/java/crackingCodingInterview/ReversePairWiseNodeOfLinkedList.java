package crackingCodingInterview;

public class ReversePairWiseNodeOfLinkedList {

    static String reverseLinkedList(Node<String> node) {
        if (node.next == null)
            return node.toString();
        Node<String> temp = node;

        // 1 2 3 4
        while(temp != null && temp.next != null) {
            String str = temp.data;
            temp.data = (String) temp.next.data;
            temp.next.data = str;
            temp = temp.next.next;
        }
        System.out.println(node.toString());
        return null;
    }
    /*  1- 2- 3- 4- 5- 6- 7- 8
        a<=b>=c<=d>=e<=f>=g<=h
        1  3  2  5  4  7  6  8
     */
    static String rearrangeLinkedList(Node node) {
        if (node.next == null)
            return node.toString();
        Node temp = node.next;

        // 1 2 3 4
        while(temp != null && temp.next != null) {
            Object obj = temp.data;
            temp.data = temp.next.data;
            temp.next.data = obj;
            temp = temp.next.next;
        }
        System.out.println(node.toString());
        return null;
    }


    public static void main(String[] args) {
        /*Node<String> myNode = new Node<>("Saurav");
        myNode.addElm("Kumar");
        myNode.addElm("Geeta");
        myNode.addElm("Kumari");
        reverseLinkedList(myNode);*/
        Node<Integer> myNode = new Node<>(10);
        myNode.addElm(20);
        myNode.addElm(30);
        myNode.addElm(40);
        myNode.addElm(50);
        myNode.addElm(60);
        rearrangeLinkedList(myNode);
        System.out.println(myNode.toString());
    }

    static class Node<E> {
        E data;
        Node next;

        public Node(E e) {
            this.data = e;
        }

        public Node() {

        }

        public void addNode(Node<E> node) {
            Node temp = new Node();
            temp = this;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }

        public void addElm(E e) {
            Node<E> newNode = new Node<>(e);
            Node temp = new Node();
            temp = this;
            while(temp.next!= null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node temp = new Node();
            temp = this;
            while(temp!= null) {
                sb.append(temp.data);
                sb.append(' ');
                temp = temp.next;
            }
            return sb.toString();
        }
    }
}
