import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers) {
        double sum = 0;
        for (int number : numbers) { //for number in numbers

            sum += number; //we sum the numbers in our value sum.




        }
        return sum / numbers.size(); //we return the average with decimals of the ArrayList
    }
}