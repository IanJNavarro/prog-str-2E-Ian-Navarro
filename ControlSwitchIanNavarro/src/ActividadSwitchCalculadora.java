import java.util.Scanner;

public class ActividadSwitchCalculadora {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("El siguiente programa va a pedir dos numeros y despues te preguntara que operacion\n" +
                "quieres hacer con esos numeros.");

        int num1 = pedirInt(sc,"Primer numero:");
        int num2 = pedirInt(sc, "Sgundo numero");

        System.out.println("Eligue entre las siguientes operaciones:");

        System.out.println("(1) Sumar");
        System.out.println("(2) Restar");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");

        int opcion = pedirInt(sc, "Que opcion quieres:");


        switch (opcion){
            case 1:
                System.out.println("La suma de los numeros es:");
                System.out.println(num1 +"+"+num2+"="+suma(num1,num2));
            case 2:
                System.out.println("La resta de los numeros es:");
                System.out.println(num1 +"+"+num2+"="+suma(num1,num2));
            case 3:
                System.out.println("La resta de los numeros es:");
                System.out.println(num1 +"+"+num2+"="+suma(num1,num2));
            case 4:
                System.out.println("La resta de los numeros es:");
                System.out.println(num1 +"+"+num2+"="+suma(num1,num2));
            default:
                System.out.println("Opcion invalida, Porfavor ingresa un valor entre 1 y 4");
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

    public static int suma(int num1, int num2){
        return num1 + num2;
    }

    public static int resta(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2){
        return num1 * num2;
    }

    public static double division(int num1, int num2){
        if (num1 == 0){
            System.out.println("No se puede dividir entre cero.");
            return 0;
        }else {
            return num1 / num2;
        }
    }
}
