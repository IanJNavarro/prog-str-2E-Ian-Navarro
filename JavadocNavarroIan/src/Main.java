import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular el area de un rectangulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular el area de un circulo");
            System.out.println("5. Salir del programa");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Tu IMC es:"+calcularIMC(sc));
                    break;
                case 2:
                    System.out.println("El area del rectangulo es:" + calcularAreaRect(sc));
                    break;
                case 3:
                    System.out.println("La temperatura en grados Farenheit es:" + convertirCelsiusAFarenheit(sc));
                    break;
                case 4:
                    System.out.println("El area del circulo es" + calcularAreaCircle(sc));
                    break;
                default:
                    System.out.println("Porfavor ingresa un numero valido");
            }
            System.out.println();

        } while (choice != 5);
    }

    /**
     * Metodo para escribir un mensaje y pedir valores double.
     * @param sc -> Scanner previamente definido
     * @param mensaje -> Mensaje a mostrar
     * @return -> double
     */
    public static double obtenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    /**
     * Metodo que pide peso en kilos y altura en metros para calcular el IMC del usuario.
     * @param sc -> Scanner previamente definido
     * @return -> double del IMC
     */
    public static double calcularIMC(Scanner sc){
        double peso = obtenerDouble(sc, "Ingresa tu peso en kilos?");
        double altura = obtenerDouble(sc, "Ingresa tu altura en metros");

        double IMC = peso/(altura * altura);

        return IMC;
    }

    /**
     * Metodo que pide la base y la altura de un rectangulo para calcular su area.
     * @param sc -> Scanner previamente definido
     * @return -> area del rectangulo en double
     */
    public static double calcularAreaRect(Scanner sc){
        double base = obtenerDouble(sc, "Cual es la base del rectangulo:");
        double altura = obtenerDouble(sc, "Cual es la altura del rectangulo:");

        double area = base * altura;

        return area;
    }

    /**
     * Metodo que pide grados Celsius para convertirlos a Farenheit.
     * @param sc -> Scanner previamente definido
     * @return -> Grados Farenheit en double
     */
    public static double convertirCelsiusAFarenheit(Scanner sc){
        double celsius = obtenerDouble(sc, "Cual es la temperatura en grados Celsius para convertir a Farenheit");

        double farenheit = (celsius * 1.8) + 32;

        return farenheit;
    }

    /**
     * Metodo que calcula el area de un circulo solicitando el radio
     * @param sc -> Scanner previamente definido
     * @return -> area del circulo en double
     */
    public static double calcularAreaCircle(Scanner sc){
        double radio = obtenerDouble(sc, "Cual es el radio del circulo:");
        double PI = 3.1416;

        double area = PI * (radio * radio);

        return area;
    }
}