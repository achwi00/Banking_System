public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Client 0: ");
        Account client0 = new Account(1000,"Barbra","Kowalsky");
        System.out.println("Account details: ");
        System.out.println(client0.toString());
        client0.Deposit(2000);
        client0.setDailyLimit(1500);
        System.out.println(client0.getDailyLimit());
        client0.Withdrawal(100);

        System.out.println("\n\nClient 1: ");
        Account client1 = new Account(1001, "Ada", "Smith");
        client1.Deposit(4000);
        System.out.println("Account details: ");
        System.out.println(client1.toString());
        client1.setDailyLimit(1100);
        client1.Withdrawal(1100);
        System.out.println("Account details: ");
        System.out.println(client1.toString());

    }
}