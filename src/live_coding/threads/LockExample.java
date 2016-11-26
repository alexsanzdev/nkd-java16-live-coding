package live_coding.threads;

public class LockExample {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);

        while (true) {

            new Thread(() -> {
                try {
                    Thread.sleep((long)(Math.random() * 1000)+1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.withdraw(100);
                System.out.printf("Balance after withdrawal of %d is %d%n", 100, account.getBalance());
            }).start();
        }


    }
}
