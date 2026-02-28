import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    // Insert at end
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    // Reverse linked list
    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Print list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node head = null;

        // Create original list
        for (int i = 0; i < n; i++) {
            head = insert(head, sc.nextInt());
        }

        Node evenHead = null;
        Node oddHead = null;

        Node temp = head;

        // Separate even & odd
        while (temp != null) {
            if (temp.data % 2 == 0)
                evenHead = insert(evenHead, temp.data);
            else
                oddHead = insert(oddHead, temp.data);

            temp = temp.next;
        }

        // Reverse both lists
        evenHead = reverse(evenHead);
        oddHead = reverse(oddHead);

        // Join even + odd
        if (evenHead == null) {
            printList(oddHead);
        } else {
            Node t = evenHead;
            while (t.next != null)
                t = t.next;

            t.next = oddHead;
            printList(evenHead);
        }

        sc.close();
    }
}