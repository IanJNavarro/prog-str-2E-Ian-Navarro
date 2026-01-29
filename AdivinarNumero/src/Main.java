import java.util.Random;
import java.util.Scanner;

public class Main {
    static int countOutofRange = 0;
    static int countNonNumeric = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int intentos = 0;
        int limiteIntentos = 7;
        int secreto = random.nextInt(max)+min;
        boolean gano = false; //Bandera win or lose

        System.out.println(secreto);
        System.out.println("Adivina el numero entre (1-100), intentos restantes: "+limiteIntentos);
        while(intentos < limiteIntentos){
            int valor = obtenerNumeroValido(sc, min, max,"Intento "+(intentos+1));
            intentos ++;
            if (valor == secreto){
                System.out.println("Ganaste en el "+intentos+" intento.");
                System.out.println("Las veces que estuviste fuera de rango fue de: "+countOutofRange);
                System.out.println("Las veces que ingresaste un valor que no era numerico fue de: "+countNonNumeric);
                gano = true;
                break;
            } else if (valor > secreto) {
                System.out.println("El numero secreto es menor al valor ingresado");
            }else System.out.println("El numero secreto es mayor al valor ingresado. ");
        }
        if (!gano){
            System.out.println("PERDISTE, el numero secreto era: "+secreto);
            System.out.println("Las veces que estuviste fuera de rango fue de: "+countOutofRange);
            System.out.println("Las veces que ingresaste un valor que no era numerico fue de: "+countNonNumeric);
        }
        sc.close();
    }

    /**
     * Metodo que muestra un mensaje para pedir un numero en un rango especifico y validar que sea un valor numerico
     * @param sc -> Scanner previamente definido
     * @param min -> limite minimo para rango
     * @param max -> limite maximo para rango
     * @param mensaje -> mensaje a mostrar
     * @return -> int validada como numero en un rango especifico
     */
    public static int obtenerNumeroValido(Scanner sc, int min, int max, String mensaje ){
        int valor;
        //ciclo infinito
        while (true){ //pide datos de forma indefinida until right
            System.out.println(mensaje);

            if (sc.hasNextInt()){ //Comprueba que sc tenga un numer
                valor = sc.nextInt();
                if (valor >= min && valor <= max){ //comprueba si el num esta en rango
                    return valor;
                }else {
                    System.out.println("Numero fuera de rango, debe de ser entre " + min + " y " + max);
                    countOutofRange++;
                }
            }else {
                System.out.println("El dato que ingresaste no es un numero");
                countNonNumeric++;
                sc.next();
            }
        }
    }
}