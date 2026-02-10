import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int opcion;

        do {
            System.out.println("------------MENU------------");
            System.out.println("1) Alta");
            System.out.println("2) Buscar por ID");
            System.out.println("3) Baja logica por ID");
            System.out.println("4) Listar ID activas");
            System.out.println("5) Actualizar nombre por ID");
            System.out.println("0) Salir");

            opcion = sc.nextInt();

            switch(opcion){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
            }

        }while (opcion != 0);

    }
}