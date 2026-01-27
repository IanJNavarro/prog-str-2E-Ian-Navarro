import java.util.Scanner;

public class Main {
    static int count = 0;
    static int countCaF = 0;
    static int countFaC = 0;
    static int countKaM = 0;
    static int countMaK = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;


        do {
            System.out.println("Menu:");
            System.out.println("1. Convertir °C a °F");
            System.out.println("2. Convertir °F a °C");
            System.out.println("3. Convertir Km a Millas");
            System.out.println("4. Convertir Millas a Km");
            System.out.println("5. Salir del programa");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("La temperatura en grados Farenheit es:" + convertirCelsiusAFarenheit(sc));
                    break;
                case 2:
                    System.out.println("La temperatura en grados Celsius es:" + convertirFarenheitACelsius(sc));
                    break;
                case 3:
                    System.out.println("La distancia en Millas es: " + convertirKmAMillas(sc));
                    break;
                case 4:
                    System.out.println("La distancia en Km es: "+convertirMillasAKm(sc));
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa!");
                    break;
                default:
                    System.out.println("Porfavor ingresa un numero valido");
            }
        } while (choice != 5);
        System.out.println("El numero de conversiones totales fue de:"+count);
        System.out.println("El numero de conversiones de Celsius a Farenheit fue de:"+countCaF);
        System.out.println("El numero de conversiones de Farenheit a Celsius fue de:"+countFaC);
        System.out.println("El numero de conversiones de Millas a Km fue de:"+countMaK);
        System.out.println("El numero de conversiones de Km a Millas fue de:"+countKaM);
    }

    /**
     * Metodo para escribir un mensaje, pedir un double y confirmar que sea double.
     * @param sc -> Scanner previamente definido
     * @param mensaje -> Mensaje a mostrar
     * @return -> double
     */
    public static double obtenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        while (!sc.hasNextDouble()){
            System.out.println("Porfavor ingresa un valor numerico");
            sc.next();
        }
        return sc.nextDouble();
    }

    /**
     * Metodo que pide grados Celsius para convertirlos a Farenheit.
     * @param sc -> Scanner previamente definido
     * @return -> Grados Farenheit en double
     */
    public static double convertirCelsiusAFarenheit(Scanner sc){
        double celsius = obtenerDouble(sc, "Cual es la temperatura en grados Celsius para convertir a Farenheit");

        double farenheit = (celsius * 1.8) + 32;

        count++;
        countCaF++;

        return farenheit;
    }

    /**
     * Metodo que pide grados Farenheit para convertirlos a Celsius.
     * @param sc -> Scanner previamente definido
     * @return -> Grados Farenheit en double
     */
    public static double convertirFarenheitACelsius(Scanner sc){
        double farenheit = obtenerDouble(sc, "Cual es la temperatura en grados Farenheit para convertir a Celsius");

        double celsius = (farenheit - 32) / 1.8;

        count++;
        countFaC++;

        return celsius;
    }

    /**
     * Metodo para converitr Km a Miles.
     * @param sc -> previamente definido
     * @return -> double millas
     */
    public static double convertirKmAMillas(Scanner sc){
        double km = obtenerDouble(sc, "Cual es la distancia en Km");
        double millas = km / 1.609;

        count++;
        countKaM++;

        return millas;
    }

    /**
     * Metodo para converitr Millas a Km.
     * @param sc -> previamente definido
     * @return -> double millas
     */
    public static double convertirMillasAKm(Scanner sc){
        double millas = obtenerDouble(sc, "Cual es la distancia en Millas");
        double km = millas * 1.609;

        count++;
        countMaK++;

        return km;
    }

    public static boolean validarNumerico(Scanner sc, double num){
        if (sc.hasNextDouble() || sc.hasNextInt()){
            return true;
        }else {
            System.out.println("Porfavor ingresa un valor numerico");
            return false;
        }

    }
}