import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Main{
    public static Node removeDuplicates(Node head){
        Node current=head;
        while(current!=null){
            Node temp=current;
            while(temp.next!=null){
                if(temp.next.data==current.data){
                    temp.next=temp.next.next;
                }else{
                    temp=temp.next;
                }
            }
            current=current.next;
        }
        return head;
    }

public static void printList(Node head){
    Node temp=head;
    while(temp!=null){
       System.out.print(temp.data); 
       if(temp.next!=null){
           System.out.print(" ");
       }
           temp=temp.next;
       }
       System.out.println();
    }
public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            Node head=null,tail=null;
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
            Node newNode=new Node(val);
            
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
            }
            head=removeDuplicates(head);
            printList(head);
        }
    }
}
