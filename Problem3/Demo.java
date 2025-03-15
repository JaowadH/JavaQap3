public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Ellipse(5, 3),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(4)
        };

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
