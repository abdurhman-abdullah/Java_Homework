import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        game();
    }

    public static void game() {

        Scanner s = new Scanner(System.in);
        System.out.println("Where would you like to player? (1-9)");

        int num = 0;
        int computer = 0;
        String x = "X";
        String o = "O";
        String ch = "|";
        String[][] array = new String[3][5];
        boolean check = false;

        for (int z = 1; z <= 9; z++) {
            num = s.nextInt();

            computer = num + 1;

            if (num == 9)
                computer = num - 1;

            switch (num){
                case 1 :
                    array[0][0] = x;
                    break;
                case 2 :
                    array[0][2] = x;
                    break;
                case 3 :
                    array[0][4] = x;
                    break;
                case 4 :
                    array[1][0] = x;
                    break;
                case 5 :
                    array[1][2] = x;
                    break;
                case 6 :
                    array[2][4] = x;
                    break;
                case 7 :
                    array[2][0] = x;
                    break;
                case 8 :
                    array[2][2] = x;
                    break;
            }

            switch (computer){
                case 1 :
                    array[0][0] = o;
                    break;
                case 2 :
                    array[0][2] = o;
                    break;
                case 3 :
                    array[0][4] = o;
                    break;
                case 4 :
                    array[1][0] = o;
                    break;
                case 5 :
                    array[1][2] = o;
                    break;
                case 6 :
                    array[2][4] = o;
                    break;
                case 7 :
                    array[2][0] = o;
                    break;
                case 8 :
                    array[2][2] = o;
                    break;
            }

            for (int i = 0; i <= array.length - 1; i++) {

                for (int y = 0; y <= array[i].length - 1; y++) {
                    array[i][1] = ch;
                    array[i][3] = ch;

                    if(array[i][y] == null){
                        array[i][y] = "";
                    }
                     if (array[i][y].isEmpty()) {
                         System.out.print(array[i][y]);
                    } else if (array[0][2].equals(o)) {
                         check = true;
                     }else {
                         System.out.print(array[i][y]);
                     }
                    System.out.print(array[i][y]);

                }
                System.out.println();
            }
            if(check){
                System.out.print("Change");
            }
        }
    }

}
