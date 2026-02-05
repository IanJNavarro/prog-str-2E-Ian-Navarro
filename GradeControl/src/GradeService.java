public class GradeService {
    public static double calcularPromedio(double grade1, double grade2, double grade3){
        return (grade1 + grade2 + grade3)/3;
    }

    public static String determinarEstado(double finalGrade, int asistencia, boolean entregoProyecto){
        if (asistencia >= 80){
            if (entregoProyecto){
                if (finalGrade >= 70){
                    return "APROBADO";
                } else return "REPROBADO";
            } else return "REPROBADO";
        } else return "REPROBADO";

    }

    public static double calcularFinal(double promedio, int asistencia){
        return (promedio * 0.7) + (asistencia * 0.3);
    }


}
