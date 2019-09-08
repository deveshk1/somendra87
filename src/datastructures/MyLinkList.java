package datastructures;

class MyLinkList<T>
{

    private MyNode<T> head;
    private MyNode<T> nextNode;

    class MyNode<T>
    {
        T data;
        MyNode<T> link;

        MyNode(T data)
        {
            this.data = data;
            this.link = null;
        }
    }

    void add(T data)
    {
        MyNode<T> myNode = new MyNode<>(data);
        if (head == null)
        {
            head = myNode;
        } else
        {
            MyNode<T> tempNode = head;
            while (tempNode.link != null)
            {
                tempNode = tempNode.link;
            }
            tempNode.link = myNode;
        }
    }

    void addAtBeginning(T data)
    {
        MyNode<T> firstNode = new MyNode<>(data);
        if (head == null)
        {
            head = firstNode;
        } else
        {
            firstNode.link = head;
            head = firstNode;
        }
    }

    void addAtIndex(T data, int index)
    {
        nextNode = new MyNode<>(data);
        if (head == null)
        {
            head = nextNode;
        } else
        {
            int i = 1;
            MyNode<T> tempNode = head;
            while (tempNode.link != null && i < index)
            {
                i++;
                tempNode = tempNode.link;
            }
            nextNode.link = tempNode.link;
            tempNode.link = nextNode;
        }
    }

    void delete()
    {
        if (head == null)
        {
            System.out.println("nothing to delete");
        } else
        {
            MyNode<T> temp = new MyNode<>(nextNode.data);
            MyNode<T> tempNode = head;
            while (tempNode.link != null)
            {
                temp = tempNode;
                tempNode = tempNode.link;
            }
            temp.link = null;
        }
    }

    MyNode<T> reverseLinkList(){
        MyNode<T> next =null;
        MyNode<T> previous = null;
        MyNode<T> current;

        if (head == null){
            System.out.println("there is only one node in the list pelase add more to reverse");
        }
        else{
            current = head;
            while (current!=null){
                next = current.link;
                current.link = previous;
                previous = current;
                current = next;
            }
            head = previous;
        }
        return previous;
    }

    void printList()
    {
        MyNode<T> current = head;
        while (current.link != null)
        {
            System.out.print(current.data + " --> ");
            current = current.link;
        }
        System.out.println(current.data);
    }
}
