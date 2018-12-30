package ola;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Objects;

public class OLA_MergeUnsortedLinkedList {
    public static void main(String[] args) {
        List<Integer> linked1 = new LinkedList<Integer>();
        List<Integer> linked2 = new LinkedList<Integer>();

        linked1.add(51);
        linked1.add(1);
        linked1.add(251);
        linked1.add(151);

        linked2.add(25);
        linked2.add(5);
        linked2.add(95);
        linked2.add(35);

        sortLinkedLists(linked1, linked2);
    }

    static void sortLinkedLists(final List<Integer> list1, final List<Integer> list2){
        Objects.requireNonNull(list1);
        Objects.requireNonNull(list2);
        List<Integer> finalLinkedList = new LinkedList<>();
        for(int i : list1) {
            finalLinkedList.add(i);
        }
        for(int i : list2) {
            finalLinkedList.add(i);
        }

        Collections.sort(finalLinkedList);
        for (int i : finalLinkedList) {
            System.out.println(i);
        }
    }

    /*private static class Node<E> {
        E item;
        Node<E> next;

        Node(E e, Node<E> next) {
            this.item = e;
            this.next = next;
        }
    }*/
}
