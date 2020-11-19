public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int c = a;
        System.out.println("a= " + (a = b));
        System.out.println("b= " + (b = c));


    }
}

