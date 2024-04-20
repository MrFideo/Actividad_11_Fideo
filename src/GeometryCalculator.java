import java.util.Scanner;

public class GeometryCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido al Calculador de Geometría");
        boolean running = true;

        while (running) {
            System.out.println("Seleccionar propiedad a calcular: \n1. Área\n2. Perímetro\n0. Salir");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    calculate(choice);
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void calculate(int choice) {
        System.out.println("Seleccionar la figura:\n1. Círculo\n2. Triángulo\n3. Cuadrado");
        int figureType = scanner.nextInt();
        Shape shape = null;

        switch (figureType) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double height = scanner.nextDouble();
                System.out.print("Ingrese el lado 1 del triángulo: ");
                double side1 = scanner.nextDouble();
                System.out.print("Ingrese el lado 2 del triángulo: ");
                double side2 = scanner.nextDouble();
                System.out.print("Ingrese el lado 3 del triángulo: ");
                double side3 = scanner.nextDouble();
                shape = new Triangle(base, height, side1, side2, side3);
                break;
            case 3:
                System.out.print("Ingrese el lado del cuadrado: ");
                double side = scanner.nextDouble();
                shape = new Square(side);
                break;
            default:
                System.out.println("Figura no válida");
                return;
        }

        if (choice == 1) {
            System.out.println("Área: " + shape.getArea());
        } else {
            System.out.println("Perímetro: " + shape.getPerimeter());
        }
    }
}
