import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Task 1

//        int [] array = {50, -20, 0, 30, 40, 60, 10};
//        int index = 0;
//
//            for (int i = 1 ; i <= array.length-1; i++) {
//
//                if (array.length >= 2) {
//                    index = array[0];
//
//                    if (array[i] == index) {
//                        System.out.println("integers are same " + array[i] + " = " + array[i]);
//                    }
//                    else{
//                        continue;
//                    }
//                }else{
//                    System.out.println("array length not equal 2");
//                }
//            }

        //Task 2

//        int[] arr = { 1, 23, 12, 9, 30, 2, 50 };
//        int k = 3;
//        for (int i = arr.length - 1; i >= arr.length - k; i--)
//            System.out.print(arr[i] + " ");

        //Task 3
//        int[] nums = { 1, 4, 17, 7, 25, 3, 100 };
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//        double average = sum / nums.length;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > average) {
//                System.out.print(nums[i] + " ");
//            }
//        }

        //Task 4
//        int[] nums = { 1, 4, 17, 7, 25, 3, 100 };
//        int first = nums[0];
//        int last = nums[nums.length - 1];
//        int larger = Math.max(first, last);
//        System.out.println(larger);

        //Task 5
//        int[] nums = { 1, 4, 17, 7, 25, 3, 100 };
//        int[] swapped = new int[nums.length];
//        swapped[0] = nums[nums.length - 1];
//        for (int i = 1; i < nums.length - 1; i++) {
//            swapped[i] = nums[i];
//        }
//        swapped[nums.length - 1] = nums[0];
//        System.out.println(nums.toString());
//        System.out.println(swapped.toString());

        //Task 6
        String[] dictionary = { "cat", "dog", "red", "is", "am"};
        ArrayList<String> longestWords = new ArrayList<>();
        int maxLength = 0;
        for (String word : dictionary) {
            if (word.length() > maxLength) {
                longestWords.clear();
                longestWords.add(word);
                maxLength = word.length();
            } else if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }
        System.out.println(longestWords);

        //Task 7

        //Task 8

        //Task 9

        //Task 10
//        int[] arr1 = {1, 2, 3};
//        int[] arr2 = {1, 2, 3};
//        boolean result = Arrays.equals(arr1, arr2);
//        System.out.println(result);


    }
}