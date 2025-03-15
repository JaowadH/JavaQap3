public class Demo {
    public static void scaleAll(Scalable[] objects, double factor) {
        for (Scalable obj : objects) {
            obj.scale(factor);
        }
    }

    public static void main(String[] args) {
        Scalable[] scalables = {
            new Circle(5),
            new Ellipse(5, 3),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(4)
        };

        System.out.println("Before Scaling:");
        for (Scalable s : scalables) {
            System.out.println(s);
        }

        // Scale all shapes by a factor of 2
        scaleAll(scalables, 2);

        System.out.println("After Scaling:");
        for (Scalable s : scalables) {
            System.out.println(s);
        }
    }
}
