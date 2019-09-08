package java8.lamdademos;


public class LamdaThreadDemo
{
    public static void main(String[] args)
    {
        Runnable runnable = ()->
            {
                for (int i =0 ;i<5;i++)
                {
                    System.out.println("Child Thread");
                }
            };

        Thread t = new Thread(runnable);
        t.start(); // after t.start() there are two thread

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Main Thread");
            try
            {
                Thread.sleep(1500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
