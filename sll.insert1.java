class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class SinglyLinkedList{
    Node head;
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
         head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newNode;
}
void display(){
    Node temp=head;
    while(temp!=null){
    System.out.print(temp.data+" ");
    temp=temp.next;
}
}
public static void main(String[]args){
    SinglyLinkedList list=new SinglyLinkedList();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    System.out.println("SinglyLinkedList:");
    list.display();
}
}
