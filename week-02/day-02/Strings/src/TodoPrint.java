// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

public class TodoPrint {
    public static String toDo(String input) {
        String myToDo = "My todo:\n";
        String secondItem = input;
        String thirdItem = " - Download games\n";
        String fourthItem = " - Diablo";
        String result = myToDo + secondItem + thirdItem + fourthItem.indent(4);
        return result;
    }

    public static void main(String[] args) {

        String todoText = " - Buy milk\n";

        System.out.println(toDo(todoText));

    }
}
