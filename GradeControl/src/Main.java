import java.util.Scanner;

public class Main {
    private static final double MIN = 0;
    private static final double MAX = 100;
    private static final int MININT = 0;
    private static final int MAXINT = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = InputMethods.leerTextoNoVacio(sc, "Ingresa el nombre del estudiante: ");
        double grade1 = InputMethods.leerDoubleEnRango(sc, "Ingresa la primera calificacion del parcial:", MIN, MAX);
        double grade2 = InputMethods.leerDoubleEnRango(sc, "Ingresa la primera calificacion del parcial:", MIN, MAX);
        double grade3 = InputMethods.leerDoubleEnRango(sc, "Ingresa la primera calificacion del parcial:", MIN, MAX);
        int asistencia = InputMethods.leerIntEnRango(sc, "Ingresa la asistencia del estudiante", MININT, MAXINT);
        boolean entregoProyecto = InputMethods.leerBoolean(sc, "El estudiante entrego su proyecto? (ingresa solamente si o no)");

        double promedio = GradeService.calcularPromedio(grade1, grade2, grade3);
        double promedioFinal = GradeService.calcularFinal(promedio, asistencia);
        String estado = GradeService.determinarEstado(promedioFinal, asistencia, entregoProyecto);

        Report reporte1 = new Report(name, grade1, grade2, grade3, asistencia, entregoProyecto, promedio, promedioFinal, estado);

        reporte1.printReport();
    }
}