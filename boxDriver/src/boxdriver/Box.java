package boxdriver;

public class Box {

    private int length, width, height;

    public Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    public Box(int length, int width) {
        this.length = length;
        this.width = width;
        this.height = 0;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int area() {
        int area = width * length;
        return area;
    }

    public int perimeter() {
        int perimeter = 2 * width + 2 * length;
        return perimeter;
    }

    public int volume() {
        int volume = length * width * height;
        return volume;
    }

    public boolean isCube() {
        if ((width == length) && (width == height) && (length == height)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBox() {
        if ((width > 0) && (length > 0) && (height > 0)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSquare() {
        if (length == width) {
            boolean x = true;
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        if (isCube()) {
            System.out.println("This box is a cube: "+ this.length+ " on all sides");
            System.out.println("Volume: " + this.volume());
        } else if (isBox()) {
            System.out.println("This box is " + this.length + " x " + this.width + " x " + this.height);
            System.out.println("Volume: " + this.volume());
        } else if (isSquare()) {
            System.out.println("This is a flat square: "+this.length+" x "+this.width);
            System.out.println("Perimeter: " + this.perimeter());
            System.out.println("Area: " + this.area());
        } else {
            System.out.println("This is a rectangle: "+this.length+" x "+this.width);
            System.out.println("Perimeter: " + this.perimeter());
            System.out.println("Area: " + this.area());
        }
    }
}
