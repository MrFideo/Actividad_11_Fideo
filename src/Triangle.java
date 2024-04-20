public class Triangle implements Shape {
    private double base;    // Atributo para la base del triángulo
    private double height;  // Atributo para la altura del triángulo
    private double side1, side2, side3;  // Lados del triángulo

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        return 0.5 * base * height;  // Área del triángulo
    }

    public double getPerimeter() {
        return side1 + side2 + side3;  // Perímetro del triángulo
    }
}
