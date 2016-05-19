package test.Concurrents;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SequenceGeneratorBrocken
{
    private static volatile int counter = 0;

    public static int nextInt() { return counter++; }

    public static void main(String[] args) throws Exception
    {
        List<Thread> threads = new ArrayList<Thread>();

        for (int i = 0; i < 10; ++i)
        {
//            Thread thread = new Thread(() -> (System.out.println("Hello")));
//            thread.start();
//            threads.add(thread);
        }
    }
}
