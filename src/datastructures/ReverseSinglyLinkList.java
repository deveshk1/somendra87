package datastructures;

public class ReverseSinglyLinkList
{
    MyLinkList.MyNode head;
    public void reverseSinglyLinkList(){
        MyLinkList.MyNode current;
        MyLinkList.MyNode next = null;
        MyLinkList.MyNode previous = null;
        if (head == null){
            System.out.println("nothing to reverse ");
        }
        else
        {
            current = head;
            while (current!=null){
                next = current.link;
                current.link = previous;
                previous = current;
                current = next;
            }
            head = previous;
        }
    }

    public static void main(String[] args)
    {
        MyLinkList<String> list = new MyLinkList<>();
        System.out.println("Add elements to Linked List :");
        System.out.println("----------------------------");
        list.add("somendra");
        list.add("anu");
        list.add("ravi");
        list.add("rakhi");
        list.add("baby");
        list.printList();
        System.out.println("----------------------------");
        System.out.println();

        list.reverseLinkList();
        list.printList();
    }
}
