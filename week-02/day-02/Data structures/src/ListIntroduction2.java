import java.util.*;

//Create a list ('List A') which contains the following values
//        Apple, Avocado, Blueberries, Durian, Lychee
//        Create a new list ('List B') with the values of List A
//        Print out whether List A contains Durian or not
//        Remove Durian from List B
//        Add Kiwifruit to List A after the 4th element
//        Compare the size of List A and List B
//        Get the index of Avocado from List A
//        Get the index of Durian from List B
//        Add Passion Fruit and Pomelo to List B in a single statement
//        Print out the 3rd element from List A
public class ListIntroduction2 {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();

        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        List<String> listB = new ArrayList<>();
        listB.addAll(listA);

        System.out.println(listA.contains("Durian"));
        listB.remove("Durian");
        String container = listA.get(3);
        listA.add(4, "Kiwifruit");
        listA.add(container);
        System.out.println(listA);
        System.out.println(listA.size() == listB.size());
//        Easier way to comper the sizes?
//        int a == listA.size();
//        int b = listB.size();
//        how to make this continuously keep it true or false?
//        When list size changes the statment become -1
//        if (a == b) {
//            System.out.println("List size are equal!");
//        } else {
//            System.out.println("List size are not equal!");
//        }
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        List<String> extra = Arrays.asList("Passion Fruit", "Pomelo");
        listB.addAll(extra);
//        System.out.println(b);
        System.out.println(listA.get(2));
    }
}
