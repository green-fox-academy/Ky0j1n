// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`
public class DoublingClass {
    public static int doubling(int num) {
        int result = num * 2;
        return result;
    }

    public static void doubling2(int num) {
        int result = num * 2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int baseNum = 123;
//        int result = doubling(baseNum);
        System.out.println(doubling(baseNum));
        doubling2(baseNum);
    }
}
