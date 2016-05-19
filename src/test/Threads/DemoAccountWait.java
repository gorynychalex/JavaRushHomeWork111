package test.Threads;

public class DemoAccountWait
{
    public static void main(String[] args) throws InterruptedException
    {
        Accounts accounts = new Accounts(0);

        new DepositThread(accounts).start();
        System.out.println("Calling waitAndWithDraw ");

        accounts.waitAndWithDraw(50_000_000);

        System.out.println("waitAndWithDraw() finished");
    }

    private static class DepositThread extends Thread{
        private final Accounts accounts;

        private DepositThread(Accounts accounts){
            this.accounts = accounts;
        }

        public void run(){
            for (int i = 0; i < 20_000; i++)
            {
                accounts.deposit(1);
            }
        }
    }
}


