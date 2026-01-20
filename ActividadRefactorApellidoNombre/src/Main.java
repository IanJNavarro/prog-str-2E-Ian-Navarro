import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner   = new Scanner(System.in);

        System.out.println("El siguiente programa suma 3 numeros y da su promedio");

        int a = pedirInt(scanner, "Ingresa el primer numero:");
        int b = pedirInt(scanner, "Ingresa el segundo numero:");
        int c = pedirInt(scanner, "Ingresa el tercer numero:");

        int suma = a + b + c;

        System.out.println("La suma de los 3 numeros es:" + suma);

        double promedio = suma / 3.0;

        System.out.println("El promedio de los numeros es:" + promedio);
    }


    /**
     * Funcion para pedir un Int mostrando un mensaje.
     * @param sc -> Previamente definido
     * @param mensaje -> Mensaje a pedir para mostrar String
     * @return -> Int
     */
    public static int pedirInt(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }
}