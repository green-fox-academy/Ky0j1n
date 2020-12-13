import java.lang.reflect.Array;
import java.util.ArrayList;

//public class SubInt {
//    public static void main(String[] args) {
//        //  Create a function that takes a number and an array of integers as a parameter
//        //  Returns the indices of the integers in the array of which the first number is a part of
//        //  Or returns an empty array if the number is not part of any of the integers in the array
//
//        //  Example:
//        System.out.println(Arrays.toString(subInt(1, new int[] {1, 11, 34, 52, 61})));
//        //  should print: `[0, 1, 4]`
//        System.out.println(Arrays.toString(subInt(9, new int[] {1, 11, 34, 52, 61})));
//        //  should print: '[]'
//
//        // Note: We are using Arrays.toString() function as a way to print
//        // array returned from subInt(). You could just as well iterate over array to print it.
//    }
//}




public class SubInt {
    public static Integer[] arrayIndex(int numberWhatWeLooking4, Integer[] array){
        ArrayList<Integer>index= new ArrayList<Integer>();

        for (int i = 0; i< array.length; i++){
            if(String.valueOf(array[i]).contains(String.valueOf(numberWhatWeLooking4))) {
                index.add(i);
            }
        }
        Integer[] result = new Integer[index.size()];
        index.toArray(result);
        return result;
    }
//    Don't know how to print [] in case if index is empty

    public static void main(String[] args){
        Integer[] array= {1, 11, 34, 52, 61};
        int num = 1;

           ;
            for(int content :  arrayIndex(1,array)) {
                System.out.print(content + ", ");
            }

    }
}
