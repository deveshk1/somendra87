package datastructures.doublylinklist;

public class DoublyLinkedList<T>
{
    DoublyLinkedListNode<T> myNode;
    public DoublyLinkedListNode<T> head;
    DoublyLinkedListNode<T> current;
    DoublyLinkedListNode<T> temp;

    class DoublyLinkedListNode<T>
    {
        T data;
        DoublyLinkedListNode<T> next;
        DoublyLinkedListNode<T> previous;

        DoublyLinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public void addElem(T data)
    {
        myNode = new DoublyLinkedListNode<>(data);

        if (head == null)
        {
            head = myNode;
        } else
        {
            current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = myNode;
            myNode.previous = current;
        }
    }

    static int ctr=0;
    public  DoublyLinkedListNode<T>  rev(DoublyLinkedListNode<T> head)
    {
        System.out.println("Recursive Call : "+ctr++);
        DoublyLinkedListNode<T> temp = head.next;
        DoublyLinkedListNode<T> newHead = head;
        if (head.next != null){
            System.out.println("Calling : Rev with head = "+head.next.data);
            newHead = rev(head.next);
        }


        System.out.println("Swapping  next<>prev AT Node : with head = "+head.data);
        head.next = head.previous;
        head.previous = temp;


        return newHead;
    }
    public void reverse(){
        head = rev(head);
    }

    public void reverseDoublyLinkList()
    {
        if (head == null)
        {
            System.out.println("nothing to reverse");
        } else
        {
            DoublyLinkedListNode<T> temp = head;
            DoublyLinkedListNode<T> current = head;
            while (current != null)
            {
                temp = current.previous;
                current.previous = current.next;
                current.next = temp;
                current = current.previous;
            }
            head = temp.previous;
        }
    }

    public void printDoublyLinkList()
    {
        DoublyLinkedListNode<T> tempNode;
        tempNode = head;
        while (tempNode != null)
        {
            System.out.print(tempNode.data + " <-> ");
            tempNode = tempNode.next;
        }
        System.out.println(tempNode);
    }
}
