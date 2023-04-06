
public class Account
{
    int Client_Number;
    String name;
    String surname;

    float balance;
    float dailyLimit=1000;

    Account(int Client_Number, String name, String surname)
    {
        this.Client_Number = Client_Number;
        this.name = name;
        this.surname = surname;
        balance=0;
    }
    int getClient_Number()
    {
        return Client_Number;
    }
    String getName()
    {
        return name;
    }

    String getSurname()
    {
        return surname;
    }
    float getBalance()
    {
        return balance;
    }
    float getDailyLimit()
    {
        return dailyLimit;
    }
    
    public String toString()//return account details
    {
        return Client_Number + "\n" + name + "\n" + surname + "\n"+ balance;
    }
    void setDailyLimit(float amount)//sets daily limit of withdrawal
    {
        if (amount<=balance)//check if the amount is possible
        {
            dailyLimit= amount;//if so, set the new daily limit
        }

    }
    void Deposit(float amount)
    {
        balance += amount;
        System.out.println("Successful deposit!Your account balance is: " + balance);
    }
    void Withdrawal(float amount)
    {
        if((amount<=balance)&&(amount<=dailyLimit))//check if the amount is smaller than balance and daily limit
        {
            balance -= amount;
            dailyLimit -=amount;
            System.out.println("Successful withdrawal! Your account balance is: "+ balance);
        }
        else if(amount>balance)//if it's greater than the balance, display a proper message
        {
            System.out.println("The amount you're trying to withdraw is greater than your account balance.");
        }
        else//if it's greater than the daily limit, display a proper message
        {
            System.out.println("The amount you're trying to withdraw is greater than your daily limit");
            //System.out.println("Do you want to set a greater daily limit?");

        }
    }
}
