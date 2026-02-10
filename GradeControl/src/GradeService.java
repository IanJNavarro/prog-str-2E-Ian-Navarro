public class GradeService {
    public static double calcularPromedio(double grade1, double grade2, double grade3){
        return (grade1 + grade2 + grade3)/3;
    }

    /**
     * Metodo para determinar si un estudiante Aprobo o Reprobo.
     * @param finalGrade -> Double
     * @param asistencia -> Int
     * @param entregoProyecto ->Boolean
     * @return -> String decision del programa
     */
    public static String determinarEstado(double finalGrade, int asistencia, boolean entregoProyecto){
        if (asistencia >= 80){
            if (entregoProyecto){
                if (finalGrade >= 70){
                    return "APROBADO";
                } else return "REPROBADO";
            } else return "REPROBADO";
        } else return "REPROBADO";

    }

    /**
     * Metodo para calcular el promedio final del estudiante.
     * @param promedio -> Double
     * @param asistencia -> Int
     * @return -> Double
     */
    public static double calcularFinal(double promedio, int asistencia){
        return (promedio * 0.7) + (asistencia * 0.3);
    }
}
