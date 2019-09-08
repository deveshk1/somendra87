package datastructures;

public class MyListTest
{
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

        /*System.out.println("Adding element at the beginning of the list : ");
        System.out.println("----------------------------");
        list.addAtBeginning("arvind");
        list.printList();
        list.addAtBeginning("Nimesh");
        list.printList();
        list.addAtBeginning("apoorv");
        list.printList();
        System.out.println("----------------------------");
        System.out.println();

        System.out.println("Adding element at the index : ");
        System.out.println("----------------------------");
        list.addAtIndex("prakash", 2);
        list.printList();
        System.out.println("----------------------------");
        System.out.println();

        System.out.println("Deleting the elemnt at the end of the list : ");
        System.out.println("----------------------------");
        list.delete();
        list.printList();
        System.out.println("----------------------------");*/
    }
}
