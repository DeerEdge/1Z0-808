package chapter02;

// Display multiple lines with printf
public class Welcome4
{
    public static void main(String[] args)
    {
        /*
            %s is a placeholder for strings
            %n has similar function to \n, starts a newline
         */
        System.out.printf("%s%n%s%n",
                "Welcome to", "Java Programming!");
    }
}
