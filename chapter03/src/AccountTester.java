import java.util.Scanner;

public class AccountTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // create an instance of the Account class
        Account myAccount = new Account("Jake's Account", 15);

        // null initial value
        System.out.printf("Initial name is %s%n%n", myAccount.getName());

        // read and set name
        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        // retrieve the updated name of the object
        System.out.printf("Name in object myAccount is:%n%s%n",
                myAccount.getName());

        // deposit an amount
        System.out.println("Please enter an amount to deposit:");
        double theDeposit = input.nextDouble();
        myAccount.deposit(theDeposit);
        System.out.println();

        // retrieve the updated balance of the object
        System.out.printf("Balance of object myAccount is:%n%f%n",
                myAccount.getBalance());
    }
}
