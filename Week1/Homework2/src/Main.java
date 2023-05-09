import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Task 1
//        for (int i = 1; i <= 100; i++) {
//
//            if(i % 3 == 0){
//                System.out.println("Fizz " + i);
//            } if(i % 5 == 0){
//                System.out.println("Buzz " + i);
//            } if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz " + i);
//            }
//
//        }

        //Task 2
//            String data = "The quick brown fox";
//            for(int i = data.length() - 1; i >= 0 ; i--){
//            System.out.print(data.charAt(i));
//        }

        //Task 3
//        Scanner s = new Scanner(System.in);
//        System.out.println("Pls enter a number");
//        int y = s.nextInt();
//        for(int i = 1; i <= 10; i++){
//            System.out.println(i * y);
//        }

        //Task 4
//        Scanner s = new Scanner(System.in);
//        System.out.println("Pls enter a number");
//        int y = s.nextInt();
//        for(int i = 1; i <= y; i++) {
//            int z = 0;
//            z+= 2;
//            if(m == y) {
//                System.out.println(i + " * " + z + " = " + m);
//            }
//        }

        //Task 5
//         Scanner input = new Scanner(System.in);
//    System.out.println("Enter the base number:");
//    int base = input.nextInt();
//    System.out.println("Enter the exponent:");
//    int exponent = input.nextInt();
//
//    int result = 1;
//    for (int i = 0; i < exponent; i++) {
//      result *= base;
//    }
//
//    System.out.println(base + " raised to the power of " + exponent + " is " + result);

        //Task 6
//        Scanner s = new Scanner(System.in);
//        System.out.println("Pls enter a number");
//        int num = s.nextInt();
//        int sum = 0;
//        int z = 0;
//        for(int i = 1 ; i < num; i++) {
//            if(i % 2 == 0){
//                z = i;
//                System.out.println(i);
//            }else {
//                z = i;
//                System.out.println(i);
//            }
//            sum += z;
//        }
//        System.out.println(sum);

        //Task 7
//            Scanner s = new Scanner(System.in);
//            System.out.println("Pls enter a number");
//            int num = s.nextInt();
//            boolean isPrime = true;
//        if (num <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//                if(isPrime){
//                    System.out.println(num + " is a prime number.");
//                }else {
//                    System.out.println(num + " is not a prime number.");
//                }
//            }

        //Task 8
//        int num, positiveCount = 0, negativeCount = 0, zeroCount = 0;
//        char choice;
//        Scanner input = new Scanner(System.in);
//
//        do {
//            System.out.println("Enter an integer:");
//            num = input.nextInt();
//
//            if (num > 0) {
//                positiveCount++;
//            } else if (num < 0) {
//                negativeCount++;
//            } else {
//                zeroCount++;
//            }
//
//            System.out.println("Do you want to continue? (y/n)");
//            choice = input.next().charAt(0);
//        } while (choice == 'y' || choice == 'Y');
//
//        System.out.println("Positive integers entered: " + positiveCount);
//        System.out.println("Negative integers entered: " + negativeCount);
//        System.out.println("Zeroes entered: " + zeroCount);

        //Task 9
//        for (int week = 1; week <= 4; week++) {
//            System.out.println("week " + week);
//            for (int day = 1; day <= 7; day++) {
//                System.out.println("day " + day);
//            }
//        }

        //Task 10
        String original, reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        original = input.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}