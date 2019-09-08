package datastructures.doublylinklist;

public class TestDoublyLinkedList
{
    public static void main(String[] args)
    {
        DoublyLinkedList<String> dlist = new DoublyLinkedList<>();
        dlist.addElem("somendra");
        dlist.addElem("ravi");
        dlist.addElem("rakhi");
        dlist.addElem("anu");
        dlist.addElem("shivesh");
        dlist.addElem("niki");
        dlist.addElem("baby");
        dlist.printDoublyLinkList();

        //dlist.reverse();
        //dlist.printDoublyLinkList();

        dlist.reverseDoublyLinkList();
        dlist.printDoublyLinkList();
    }
}
