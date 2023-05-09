import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Task 1
//        int firstNumber = 125;
//        int secondNumber = 24;
//        int sum = firstNumber + secondNumber;
//        int min = firstNumber - secondNumber;
//        int mul = firstNumber * secondNumber;
//        int div = firstNumber / secondNumber;
//        int mod = firstNumber % secondNumber;
//        System.out.println("sum is = " + sum + "\n" + "minus is = " + min + "\n"
//                + "multiplication is = " + mul + "\n" + "division is = " + div + "\n" + "mod is = " + mod);

        //Task 2
//        String data = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
//        System.out.println(data.toLowerCase());

        //Task 3
//        Scanner s = new Scanner(System.in);
//        System.out.println("Please enter text");
//        String text = s.nextLine();
//        System.out.println("Please enter number");
//        int num = s.nextInt();
//        System.out.println(text.charAt(num));

        //Task 4
//        int num = 20;
//
//        if(0 == num % 2){
//            System.out.println(1);
//        }else{
//            System.out.println(0);
//        }

        //Task 5
//        Scanner s = new Scanner(System.in);
//        System.out.println("Pls enter your role");
//        String role = s.nextLine();
//        if(role.equals("admin") || role.equals("superuser")){
//            System.out.println("welcome " + role);
//        }else{
//            System.out.println("welcome " + role);
//        }

        //Task 6
//        int firstNum = 10;
//        int secondNum = 5;
//        int thirdNum = 15;
//        if(firstNum + secondNum == thirdNum){
//            System.out.println("The result is:" + true);
//        }else{
//            System.out.println("The result is:" + false);
//        }

        //Task 7
//        Scanner s = new Scanner(System.in);
//        System.out.println("Pls enter firstNum");
//        int firstNum = s.nextInt();
//        System.out.println("Pls enter secondNum");
//        int secondNum = s.nextInt();
//        System.out.println("Pls enter thirdNum");
//        int thirdNum = s.nextInt();
//
//        if(firstNum > secondNum && firstNum > thirdNum) {
//            System.out.println("The greatest:" + firstNum);
//        }else if(secondNum > thirdNum) {
//            System.out.println("The greatest:" + secondNum);
//        }else{
//            System.out.println("The greatest:" + thirdNum);
//        }

        //Task 8
        Scanner s = new Scanner(System.in);
        System.out.println("Input number");
        int num = s.nextInt();
        switch (num){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
        }
    }
}