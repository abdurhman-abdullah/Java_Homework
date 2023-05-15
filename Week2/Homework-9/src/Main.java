// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        System.out.println("----------------------Class MovablePoint--------------------------");
        MovablePoint mp = new MovablePoint(20, 30, 10, 15);
        System.out.print("moveUp = ");
        mp.moveUp();
        System.out.print("moveDown = ");
        mp.moveDown();
        System.out.print("moveLeft = ");
        mp.moveLeft();
        System.out.print("moveRight = ");
        mp.moveRight();

    }
}