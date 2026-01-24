import java.util.Scanner;

public class ActividadSwitchCalculadora {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("El siguiente programa va a pedir dos numeros y preguntara que operacion\n" +
                "quieres hacer con esos numeros.");

        System.out.println("Elige entre las siguientes operaciones:");

        System.out.println("(1) Sumar");
        System.out.println("(2) Restar");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");

        int opcion = pedirInt(sc, "Que opcion quieres:");

        int num1 = pedirInt(sc, "Primer numero:");
        int num2 = pedirInt(sc, "Sgundo numero");

        switch (opcion){
            case 1:
                System.out.println("La suma de los numeros es:");
                System.out.println(num1 +"+"+num2+"="+suma(num1,num2));
                break;
            case 2:
                System.out.println("La resta de los numeros es:");
                System.out.println(num1 +"-"+num2+"="+resta(num1,num2));
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros es:");
                System.out.println(num1 +"*"+num2+"="+multiplicacion(num1,num2));
                break;
            case 4:
                division(num1,num2);
                break;
            default:
                System.out.println("Opcion invalida. Porfavor ingresa un valor entre 1 y 4");
                break;
        }


    }

    /**
     * Metodo para pedir valores int y mostrar un mensaje.
     * @param sc -> preeviamente definido
     * @param mensaje -> mensaje a mostrar
     * @return -> int
     */
    public static int pedirInt(Scanner sc,String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }

    /**
     * Metodo para sumar el primer numero mas el segundo
     * @param num1 -> int primer numero de la operacion
     * @param num2 -> int segundo numero de la operacion
     * @return -> int suma
     */
    public static int suma(int num1, int num2){
        return num1 + num2;
    }

    /**
     * Metodo para restar el primer numero menos el segundo
     * @param num1 -> int primer numero de la operacion
     * @param num2 -> int segundo numero de la operacion
     * @return -> int resta
     */
    public static int resta(int num1, int num2){
        return num1 - num2;
    }

    /**
     *Metodo que piide 2 int para realizar multiplicacion
     * @param num1 -> int primer numero de la operacion
     * @param num2 -> int segundo numero de la operacion
     * @return -> int multiplicacion
     */
    public static int multiplicacion(int num1, int num2){
        return num1 * num2;
    }

    /**
     * Metodo que pide 2 int para dividirlos, con excepcion de cero.
     * Imprime error o el resultado de la divsion
     * @param num1 -> int dividendo
     * @param num2 -> int divisor
     */
    public static void division(int num1, int num2){
        if (num2 == 0){
            System.out.println("No se puede dividir entre cero.");
        }else {
            System.out.println("La division de los numeros es:");
            System.out.println(num1 +"/"+num2+"="+(num1/num2));
        }
    }
}
