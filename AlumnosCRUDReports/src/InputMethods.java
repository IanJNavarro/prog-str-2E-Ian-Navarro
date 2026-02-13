import java.util.Scanner;

public class InputMethods {
    /**
     * Metodo para mostrar un mensaje, pedir un String y confirmar que no este vacio.
     * @param sc -> Scanner Previamente definido
     * @param mensaje -> Mensaje a mostrar
     * @return -> String texto
     */
    public static String leerTextoNoVacio(Scanner sc, String mensaje){
        String texto;
        while (true){
            System.out.println(mensaje);
            texto = sc.nextLine();
            if (!texto.isEmpty()){
                return texto;
            }
            System.out.println("El texto no puede estar vacio.");
        }
    }

    /**
     * Metodo para mostrar un mensaje y pedir un double en un rango especifico.
     * @param sc -> escaner previamente definido
     * @param mensaje -> Mensaje a mostrar
     * @param min -> limite minimo
     * @param max -> Limite Maximo
     * @return -> Double
     */
    public static double leerDoubleEnRango(Scanner sc, String mensaje, double min, double max){
        double valor;
        while (true){
            System.out.println(mensaje);
            if(sc.hasNextDouble()){
                valor = sc.nextDouble();
                sc.nextLine();
                if (valor >= min && valor <= max){
                    return valor;
                }
                System.out.println("El numero ingresado no es valido");
            }else{
                System.out.println("Ingresa un valor numerico");
                sc.next();
            }
        }
    }

    /**
     * Metodo para mostrar un mensaje y pedir un Int en un rango especifico.
     * @param sc -> Escaner previamente definido
     * @param mensaje -> Mensaje a mostrar
     * @param min -> limite Minimo
     * @param max -> Limite Maximo
     * @return -> Int
     */
    public static int leerIntEnRango(Scanner sc, String mensaje, int min, int max){
        int valor;
        while (true){
            System.out.println(mensaje);
            if(sc.hasNextInt()){
                valor = sc.nextInt();
                sc.nextLine();
                if (valor >= min && valor <= max){
                    return valor;
                }
                System.out.println("El numero ingresado no es valido");
            }else{
                System.out.println("Ingresa un valor numerico");
                sc.next();
            }
        }
    }

    /**
     * Metodo para mostrar un mensaje y pedir String "si" o "no" y convertirlo en
     * valor boolean para regresar true or false respectivamente.
     * @param sc -> previamente definido
     * @param mensaje -> mensaje a mostrar
     * @return -> Boolean
     */
    public static boolean leerBoolean(Scanner sc, String mensaje){
        String valor;
        while (true){
            System.out.println(mensaje); // ingresa si o no
            if (sc.hasNext()){
                valor = sc.next().toLowerCase();
                if (valor.equals("si")){
                    return true;
                } else if (valor.equals("no")) {
                    return false;
                }else{
                    System.out.println("Porfavor ingresa solamente si o no ");
                }
            }else {
                sc.next();
            }
        }
    }
}
