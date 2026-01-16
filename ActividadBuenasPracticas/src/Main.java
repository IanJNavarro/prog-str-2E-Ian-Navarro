import java.util.Scanner;
public class Main{
    public static void main(String[]a){
        Scanner sc = new Scanner(System.in);

        int numero = obtenerInt(sc,"Ingresa un numero para hacer una suma aritmetica:");

        int suma = sumaSerieAritmetica(numero);

        System.out.println("La suma del numero y todos sus anteriores es:"+suma);
    }

    /**
     * Metodo para escribir mensajes y capturar valores Int
     * @param sc -> previamente declarado en main
     * @param mensaje -> parametro
     * @return -> Int
     */
    public static int obtenerInt(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }

    /**
     * Metodo para sumar un numero con todos los numeros que lo preceden.
     * @param num -> int para hacer la suma
     * @return -> La suma de los numeros en Int
     */
    public static int sumaSerieAritmetica(int num){
        int sum = 0;

        for(int i=1; i<=num; i++){
            sum += i;
        }

        return sum;
    }
}

// Link Repo: https://github.com/IanJNavarro/prog-str-2E-Ian-Navarro.git