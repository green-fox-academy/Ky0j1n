// Write a program that prints the remaining seconds (as an integer) from a
// day if the current time is represented by the variables
public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int leftOverHours = 24 - currentHours;
        int leftOverMinutes = 60 - currentMinutes;
        int leftOverSeconds = 60 - currentSeconds;
        int secondsTillMidnight = (leftOverHours * 60 * 60) + (leftOverMinutes * 60) + leftOverSeconds;
        System.out.println("Remaning seconds of the day: " + secondsTillMidnight);

    }
}
