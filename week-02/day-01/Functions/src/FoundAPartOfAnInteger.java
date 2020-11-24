//  Create a function that takes a number and an array of integers as a parameter
//  Returns the indices of the integers in the array of which the first number is a part of
//  Or returns an empty array if the number is not part of any of the integers in the array

import java.lang.reflect.Array;

//  Example:
//    System.out.println(Arrays.toString(subInt(1, new int[] {1, 11, 34, 52, 61})));
//            //  should print: `[0, 1, 4]`
//            System.out.println(Arrays.toString(subInt(9, new int[] {1, 11, 34, 52, 61})));
//            //  should print: '[]'
//
//            // Note: We are using Arrays.toString() function as a way to print
//            // array returned from subInt(). You could just as well iterate over array to print it.
//            }
public class FoundAPartOfAnInteger {
    public static int part(int a , int[]array){
        for (int i = 0; i < array.length; i++){
            if(Array.toString == a ){
                System.out.println(array[i]);
            }
        }

    }

    public static void main(String[] args){
        int a = 1;
    int[] ar = {1, 11, 34, 52, 61};
    }
}
