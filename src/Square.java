public class Square implements Shape {
    private double side;  // Atributo para el lado del cuadrado

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;  // Área del cuadrado
    }

    public double getPerimeter() {
        return 4 * side;  // Perímetro del cuadrado
    }
}