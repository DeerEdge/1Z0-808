public class Account
{
    private String name;
    private double balance;

    // constructor initializes name with parameter name (custom initialization)
    public Account(String name, double balance) // Cannot return anything
    {
        this.name = name;

        // validate that provided balance is greater than 0.0
        if (balance > 0.0)
            this.balance = balance;
    }

    // deposits an amount if it is valid
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    // sets the value of the instance variable name
    public void setName(String name)
    {
        this.name = name;
    }

    // retrieves the value of the instance variable name
    public String getName()
    {
        return name;
    }

    // retrieves the value of the instance variable balance
    public double getBalance()
    {
        return balance;
    }
}
