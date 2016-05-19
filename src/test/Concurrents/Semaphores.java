package test.Concurrents;

import java.util.concurrent.Semaphore;

public class Semaphores
{
    public static void main(String[] args) throws InterruptedException
    {
        Semaphore semaphore = new Semaphore(10);
        semaphore.acquire();
        System.out.println("This is main!");
        try
        {
            for (int i = 0; i < 10; i++)
            {
                new Thread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        System.out.println("Hello from thread " + Thread.currentThread().getName());
                    }
                });
            }
        }finally
        {
            semaphore.release();
        }
    }
}
