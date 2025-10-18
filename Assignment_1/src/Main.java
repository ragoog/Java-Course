import java.util.Date;

public class Main {
    public static void main(String[] args) {
    //q.8 : Test.id is wrong because we are treating it like a static field

        Account account = new Account();
        account.setId(1122);
        account.setBalance(20000);
        account.setAnnualInterestRate(0.045);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account.getDate());
        System.out.println(account.getBalance());
        System.out.println(account.getMonthlyInterestRate());
    }
}

class Account {

    //fields
    private int id;
    private double balance;
    private static double annualInterestRate;
    private final Date date;

    //default constructor
    public Account ()
    {
        date= new Date();
    }
    //constructor
    public  Account (int id, double balance)
    {
        this.id = id;
        this.balance = balance;
        date = new Date();
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }


    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }



    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double AnnualInterestRate) {
        annualInterestRate = AnnualInterestRate;    //static field
    }


    public Date getDate()
    {
        return date;
    }

    
public double getMonthlyInterestRate ()
{
    return annualInterestRate/12 ;
}
public double getMonthlyInterest()
{
    return balance * (getMonthlyInterestRate() / 100);
}
public void withdraw(double amount)
{
    if (amount <= balance) {
        balance -= amount;
    }
}
public void deposit(double amount)
    {
        if (amount >0) {
            balance += amount;
        }
    }

}



