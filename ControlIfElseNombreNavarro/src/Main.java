import java.util.Scanner;
import static java.lang.System.exit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = pedirInt(sc, "Cual es tu edad:");
        boolean esEstudiante = pedirDecision(sc, "Eres estudiante? (si/no)");
        int tarifa = calcularTarifa(edad, esEstudiante);

        System.out.println("Tu edad es de: " + edad);
        System.out.println("Es estudiante: " + esEstudiante);
        System.out.println("Tu tarifa final es de: " + tarifa);

    }


    /**
     * Metodo para pedir Int y mostrar un mensaje.
     * @param sc -> Previamente definido
     * @param mensaje -> String a mostrar
     * @return -> Int
     */
    public static int pedirInt(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }

    /**
     * Metodo que pide string "si" para convertir el valor a true booleano
     * @param sc -> Previamente definido
     * @param mensaje -> String a mostrar
     * @return -> Boolean
     */
    public static boolean pedirDecision(Scanner sc, String mensaje){
        System.out.println(mensaje);
        String decision = sc.next();

        if (decision.equals("si")){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Metodo para calcular la tarifa a cobrar en base a la edad y si es estudiante o no.
     * @param edad -> int para decidir tarifa
     * @param estudiante -> boolean para definir si es estudiante
     * @return -> int tarifa a pagar
     */
    public static int calcularTarifa(int edad, boolean estudiante){
        int tarifa = 0;

        if (edad > 120 || edad < 0){
            System.out.println("Edad invalida");
            tarifa = 0;
            System.exit(0);
        } else if (edad < 12) {
            tarifa = 50;
        } else if (edad >= 12 && edad <= 17) {
            tarifa = (estudiante) ? 60 : 80;
        } else {
            tarifa = (estudiante) ? 90 : 120;
        }

        return tarifa;
    }
}