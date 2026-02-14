import java.util.Scanner;

public class StudentServices {
    private Scanner sc = new Scanner(System.in);
    private Student[] stdents = new Student[25];

    private void altaEstudiante(){
        int id = InputMethods.leerIntEnRango(sc,"Ingresa un ID nuevo para el estudiante: ", 0, 100);
        for (Student student : stdents) {
            if (freeSpace()) {
                if (idFree()) {
                    student.setName(InputMethods.leerTextoNoVacio(sc, "Porfavor ingresa el nombre: "));
                    student.setGrade(InputMethods.leerDoubleEnRango(sc,"Ingresa la calificacion del estudiante: ",0,10));
                }else System.out.println("Ese ID ya esta en uso.");
            }else System.out.println("El cupo de estudiantes esta lleno.");
        }
    }

    private void bajaEstudiante(){

    }

}
