package datastructures;

/**
 * to find if there exist a cycle in the link list
 */
public class FloydCycle<T> extends MyLinkList<T>
{
    MyLinkList.MyNode head;
    MyLinkList.MyNode slow;
    MyLinkList.MyNode fast;

    public void floydCycle(){
        if (head == null){
            System.out.println("there is only one element in the list");
        }
        else
        {
            fast =head;
            slow =head;
            while (fast !=null && fast.link.link != null){
                fast = fast.link.link;
                slow = slow.link;
                if (slow == fast){
                    System.out.println("ther exists a cycle in the link list");
                }
                else
                {
                    System.out.println("there is not cycle in the link list");
                }
            }

        }
    }

    public static void main(String[] args)
    {
        FloydCycle<String> list = new FloydCycle<>();
        list.add("somendra");
        list.add("rakhi");
        list.add("ravi");
        list.add("anu");
        list.add("baby");
        list.addAtIndex("papa",2);
        list.printList();
        list.floydCycle();
        list.printList();

    }
}
