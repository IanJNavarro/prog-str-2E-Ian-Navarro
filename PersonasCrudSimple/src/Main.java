import java.util.Scanner;

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

            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 0:
                    System.out.println("Gracias por usar el programa.");
                    opcion = 0;
                    break;
                case 1:
                    PersonaServices.alta();
                    break;
                case 2:
                    int id = InputMethods.leerIntEnRango(sc, "Ingresa el ID a buscar: ", 0, 100);
                    PersonaServices.buscarPorID(id);
                    break;
                case 3:
                    PersonaServices.bajaLogica();
                    break;
                case 4:
                    PersonaServices.listarIDs();
                    break;
                case 5:
                    PersonaServices.cambiarNombre();
                    break;
                default:
                    System.out.println("Ingresa un numero valido para el menu.");
                    break;
            }

        }while (opcion != 0);

    }
}