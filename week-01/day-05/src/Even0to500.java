// Create a program that writes this line 100 times:
// "I won't cheat on the exam!"
public class Even0to500 {
    public static void main(String[] args){
        for(int i = 0; i <= 500; i++){
            if((i % 2) == 0){
                System.out.println(i);
            }
        }

    }
}
