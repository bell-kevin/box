package boxdriver;

public class BoxDriver {

    public static void main(String[] args) {
        System.out.println("Ch 7 Rectangle Project by Kevin Bell\n");
        Box paper = new Box(8, 11);
        Box square = new Box(5, 5);
        Box container = new Box(8, 4, 6);
        Box cube = new Box(3, 3, 3);
        System.out.println("Object paper");
        paper.display();
        System.out.println("\nObject square");
        square.display();
        System.out.println("\nObject container");
        container.display();
        System.out.println("\nObject cube");
        cube.display();
    }
}
