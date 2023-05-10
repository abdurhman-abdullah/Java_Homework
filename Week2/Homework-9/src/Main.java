// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book b = new Book("Can you big?" , 300, "Abdulrahman");
        double newPriseBook = b.getPrice() - b.getDiscount();
        System.out.println("Name : " + b.getName()
                + "\n" + "Prise = " + b.getPrice()
                + "\n" + "Author : " + b.getAuthor()
                + "\n" + "Discount = " + b.getDiscount()
                + "\n" + "Total Price = " + newPriseBook);

        System.out.println("------------------------------------------------");

        Movie m = new Movie("JOHN WICK: CHAPTER 4" , 650, "Abdulrahman");
        double newPriseMovie = m.getPrice() - m.getDiscount();
        System.out.println("Name : " + m.getName()
                + "\n" + "Prise = " + m.getPrice()
                + "\n" + "Director : " + m.getDirector()
                + "\n" + "Discount = " + m.getDiscount()
                + "\n" + "Total Price = " + newPriseMovie);

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