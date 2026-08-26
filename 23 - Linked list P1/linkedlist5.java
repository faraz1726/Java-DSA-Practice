import java.util.*;
public class linkedlist5 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; /*by default in java, size = 0 */

    public void addfirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print(){
        if(head == null){
            System.out.println("linked list is empty");
        }
        Node temp = head;
        while( temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void add(int idx, int data){
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i<idx-1){
            i++;
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removefirst(){
        if(size == 0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;/*explicitly giving size = 0 , because both head and tail are 0 */
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size == 0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        /*prev noid is the one having index as size-2  */
        for(int i = 0; i<size-2; i++ ){/*last element index is size-1 */
            prev = prev.next;
        }
        int val = prev.next.data;
        /*now we are standing at second last node i.e.(size-2 here called prev) */
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrsearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){/*key found */
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next , key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int recsearch(int key){
        return helper(head , key);
    }

    public void reverse(){/*remember by 3 varaible and 4 logics */
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){/*prev -- curr -- next */
            next = curr.next;/*current.next is pointing forward to next as usual */
            curr.next = prev;/*actual logic to reverse */
            prev = curr;/*now current becomes previous */
            curr = next;/*and next becomes current */
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        Node temp = head;
        int sz = 0;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        /*nth index is from the tail or end of the ll, so if n equlas to size means, 
          its refering to head , so we have to delete head */
        if(n == sz){
            head = head.next;
            return;
        }
        /*the element index which we have to delete from end is nth, but the same index
          from the starting will be size-n+1 , but we have to only go till size-n. */
        int i = 1;/*so the element 5 will be the first node at i = 1 in our ll */
        int idxTofind = sz-n;
        Node prev = head;
        while( i < idxTofind ){
            prev = prev.next;
            i++;
        }
        /*now you are at sz-n */
        prev.next = prev.next.next;
        return;
    }
    public static void main(String args[]){
        linkedlist5 ll = new linkedlist5();
        ll.print();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);
        ll.add(2,3);
        ll.print();
        
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}
