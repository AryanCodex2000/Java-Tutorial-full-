public class Rectangle {
    double length;
    double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }
    public double area(){
        return length * height;

    }
    public double perimeter(){
        return 2 * (length + height);
    }
    
}
