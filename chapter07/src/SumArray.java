public class SumArray
{
    public static void main(String[] args)
    {
        int [] array = { 1, 2, 3};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++)
            total += array[counter];

        System.out.printf("Total of array elements: %d%n", total);
    }
}
