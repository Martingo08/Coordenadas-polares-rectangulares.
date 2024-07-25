import java.util.Scanner;

public class CoordenadasPolaresRectangulares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué tipo de conversión deseas realizar?");
        System.out.println("1. Polares a rectangulares");
        System.out.println("2. Rectangulares a polares");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                PolaresARectangulares(scanner);
                break;
            case 2:
                RectangularesAPolares(scanner);
                break;
            default:
                System.out.println("Error: Opción invalida");
        }
    }

    private static void PolaresARectangulares(Scanner scanner) {
        System.out.print("Ingrese el radio: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese el ángulo en grados: ");
        double anguloGrados = scanner.nextDouble();
        double anguloRadianes = Math.toRadians(anguloGrados);

        double x = radio * Math.cos(anguloRadianes);
        double y = radio * Math.sin(anguloRadianes);

        System.out.println("Coordenadas rectangulares: (" + x + ", " + y + ")");
    }
}