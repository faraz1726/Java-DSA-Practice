import java.util.*;
public class linkedlist1 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addlast(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    public boolean isPalindrome() {

        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int[] arr = new int[size];

        temp = head;
        int i = 0;

        while (temp != null) {
            arr[i] = temp.data;
            i++;
            temp = temp.next;
        }

        for (i = 0; i < size / 2; i++) {
            if (arr[i] != arr[size - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        linkedlist1 ll = new linkedlist1();

        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(2);
        ll.addlast(1);

        if (ll.isPalindrome()) {
            System.out.println("Linked List is a palindrome");
        } else {
            System.out.println("Linked List is not a palindrome");
        }
    }
}