import java.util.*;
class Node
{
    int data;
    Node next;

    Node(int data, Node next)
    {
        this.data=data;
        this.next=next;
    }
}
class deletionLinkedList
{
    public static Node creation(int n, Scanner sc)
    {
        Node head=null;
        Node tail=null;

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter Data: ");
            int data=sc.nextInt();

            Node newNode=new Node(data,null);

            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else
            {
                tail.next=newNode;
                tail=newNode;
            }
        }
        return head;
    }

    public static void display(Node head)
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static Node deletion(Node head, int n)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1 to delete starting element: ");
        System.out.println("Enter 2 to delelte last element: ");
        System.out.println("Enter 3 to delete posioned element: ");
        System.out.println("Enter any key to exit:");
        int a=sc.nextInt();
        
        switch(a)
        {
            case 1:
                
                head=head.next;
        
                System.out.println("Starting element deleted successfully..");
                break;
            
            case 2:
                Node temp2=head;
                while(temp2.next.next!=null)
                {
                    temp2=temp2.next;
                }
                temp2.next=null;
                System.out.println("Last node deleted");
                break;

            case 3:
                int pos;
                System.out.print("Enter Position: ");
                pos=sc.nextInt();
                Node temp3=head;
                for(int i=0; i<pos-1; i++)
                {
                    temp3=temp3.next;
                }
                temp3.next=temp3.next.next;
                System.out.println("Element deleted successfully...");
                break;
            
            default:
                System.out.println("Operation happen successfully");


        }
        return head;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many nodes you wanot to insert: ");
        n=sc.nextInt();
        Node head=creation(n,sc);
        display(head);
        head=deletion(head,n);
        display(head);
    }
}