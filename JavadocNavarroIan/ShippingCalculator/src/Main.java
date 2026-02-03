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

"""
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
"""
    public boolean leerBoolean(Scanner sc, String mensaje){
        String valor;
        while (true){
            System.out.println(mensaje);
            if (sc.hasNext ){
                valor = sc.nextBoolean();
                return valor;
            }
            System.out.println("Porfavor ingresa solamente true o false");
        }
    }
}