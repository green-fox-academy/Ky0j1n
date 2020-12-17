import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//We are going to represent our expenses in a list containing integers.
//
//        Create a list with the following items.
//        500, 1000, 1250, 175, 800 and 120
//        Create an application which solves the following problems.
//        How much did we spend?
//        Which was our greatest expense?
//        Which was our cheapest spending?
//        What was the average amount of our spendings?
public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> expenses = new ArrayList<>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);

        int sum = 0;
        for (int number : expenses) {
            sum += number;
        }

        Collections.sort(expenses);
        int greatesSpend = 0;
        greatesSpend = expenses.get(expenses.size() -1 );

        int cheapestSpend = 0;
        cheapestSpend = expenses.get(0);

        int average = 0;
        int numberCounter = 0;

        for (int number : expenses){
            numberCounter++;
        }

        average = sum/numberCounter;
        System.out.println(greatesSpend);
        System.out.println(sum);
        System.out.println(cheapestSpend);
        System.out.println(average);

    }
}





