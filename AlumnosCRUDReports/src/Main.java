import java.util.Scanner;

public class Main {
    private static final int MIN_IDS = 0;
    private static final int MAX_IDS = 100;
    private static final int MIN_GRADE = 0;
    private static final int MAX_GRADE = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService grupo1 = new StudentService();

        int opcion;

        do {
            System.out.println("----------------------MENU----------------------");
            System.out.println("1) Alta de estudiante");
            System.out.println("2) Buscar estudiante por ID");
            System.out.println("3) Actualizar promedio por ID");
            System.out.println("4) Baja logica por ID");
            System.out.println("5) Listar estudiantes");
            System.out.println("6) Listar reportes de estudiantes");
            System.out.println("0) Salir");

            opcion = InputMethods.leerIntEnRango(sc, "Elige una opcion: ", 0, 6);

            switch(opcion){
                case 0:
                    System.out.println("Gracias por usar el programa.");
                    break;
                case 1:
                    String name = InputMethods.leerTextoNoVacio(sc, "Porfavor ingresa el nombre: ");
                    int id = InputMethods.leerIntEnRango(sc,"Ingresa un ID nuevo para el estudiante: ", MIN_IDS, MAX_IDS);
                    double grade = InputMethods.leerDoubleEnRango(sc,"Ingresa la calificacion del estudiante: ",MIN_GRADE,MAX_GRADE);

                    Student student = new Student(id,name,grade);

                    grupo1.altaEstudiante(student);
                    break;
                case 2:
                    int searchId = InputMethods.leerIntEnRango(sc,"Ingresa el ID del estudiante a buscar",MIN_IDS,MAX_IDS);

                    grupo1.buscarPorID(searchId);
                    break;
                case 3:
                    int idGrade = InputMethods.leerIntEnRango(sc,"Ingresa el ID del estudiante a cambiar el promedio: ",MIN_IDS,MAX_IDS);
                    double newGrade = InputMethods.leerDoubleEnRango(sc,"Ingresa el nuevo promedio del estudiante: ", MIN_GRADE,MAX_GRADE);

                    grupo1.actualizarPromedioPorID(idGrade, newGrade);
                    break;
                case 4:
                    int idBaja = InputMethods.leerIntEnRango(sc,"Ingresa el ID del estudiante para dar de baja: ",MIN_IDS,MAX_IDS);

                    grupo1.bajaEstudiante(idBaja);
                    break;
                case 5:
                    grupo1.listarActivos();
                    break;
                case 6:
                    grupo1.reportes();
                    break;
                default:
                    System.out.println("Ingresa un numero valido para el menu.");
                    break;
            }

        }while (opcion != 0);

    }
}