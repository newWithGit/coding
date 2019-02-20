package dataStructure;

public class Tree<E> {

    Node head;

    public Tree() {

    }

    public void addNode(){}

    static class Node<E> {
        E e;
        Node right;
        Node left;

        public Node (E elem, Node right, Node left) {
            this.e = elem;
            this.right = right;
            this.left = left;
        }

        public Node (E elem) {
            this.e = elem;
            this.right = this.left = null;
        }
    }

}
