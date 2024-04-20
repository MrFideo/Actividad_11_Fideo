public class Circle implements Shape {
    private double radius;  // Atributo para el radio del círculo

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;  // Área del círculo
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;  // Perímetro del círculo
    }
}