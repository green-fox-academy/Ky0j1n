// Print the Body mass index (BMI) based on these values
public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        System.out.println("Your Bmi is: " + (int)(massInKg / (heightInM * heightInM)));
    }

}