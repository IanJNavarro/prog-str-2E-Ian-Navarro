import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



    }

    public double leerDoubleEnRango(Scanner sc, String mensaje, double min, double max){
        double valor;
        while (true){
            System.out.println(mensaje);
            if(sc.hasNextDouble()){
                valor = sc.nextDouble();
                if (valor > min && valor <= max){
                    return valor;
                }
                System.out.println("El numero ingresado no es valido");
            }else{
                System.out.println("Ingresa un valor numerico");
                sc.next();
            }
        }
    }

    public int leerIntEnRango(Scanner sc, String mensaje, int min, int max){
        int valor;
        while (true){
            System.out.println(mensaje);
            if(sc.hasNextInt()){
                valor = sc.nextInt();
                if (valor > min && valor <= max){
                    return valor;
                }
                System.out.println("El numero ingresado no es valido");
            }else{
                System.out.println("Ingresa un valor numerico");
                sc.next();
            }
        }
    }

    public boolean leerBoolean(Scanner sc, String mensaje){
        String valor;
        while (true){
            System.out.println(mensaje); // ingresa si o no
            if (sc.hasNext()){
                valor = sc.next();
                if (valor.equals("si")){
                    return true;
                } else if (valor.equals("no")) {
                    return false;
                }
            }else {
                System.out.println("Porfavor ingresa solamente si o no");
                sc.next();
            }
        }
    }
}