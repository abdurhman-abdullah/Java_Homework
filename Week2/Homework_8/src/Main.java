// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Circle c = new Circle( "black", true , 6);
        System.out.println(c.toString());

        System.out.println("-------------------------------------------------");
        Rectangle r = new Rectangle( "black", true, 3, 3);
        System.out.println(r.toString());

        System.out.println("-------------------------------------------------");
        Square s = new Square("black", true, 3);
        System.out.println(s.toString());
    }
}