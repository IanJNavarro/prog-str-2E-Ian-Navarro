public class Report {
    String name;
    double grade1;
    double grade2;
    double grade3;
    int attendance;
    boolean projectTurnedIn;
    double average;
    double finalGrade;
    String estado;

    public Report(
        String name,
        double grade1,
        double grade2,
        double grade3,
        int attendance,
        boolean projectTurnedIn,
        double average,
        double finalGrade,
        String estado
    ){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.attendance = attendance;
        this.projectTurnedIn = projectTurnedIn;
        this.average = average;
        this.finalGrade = finalGrade;
        this.estado = estado;
    }

    /**
     * Metodo para convertir
     * @return -> String Resultado
     */
    private String projectAnswer(){
        if (this.projectTurnedIn){
            return "Entregado";
        }else return "NO Entrego";
    }

    /**
     * Metodo para imprimir los datos del objeto en un reporte.
     */
    public void printReport(){
        System.out.println("------------------REPORTE-------------------");
        System.out.println("Nombre del estudiante: "+ this.name);
        System.out.println("- - - - - - - - PARCIALES - - - - - - - - - -");
        System.out.println("Parcial 1: "+ this.grade1);
        System.out.println("Parcial 2: "+ this.grade2);
        System.out.println("Parcial 3: "+ this.grade3);
        System.out.println("Promedio de parciales: "+ this.average);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Asistencia: "+ this.attendance);
        System.out.println("Proyecto: " + projectAnswer());
        System.out.println("Promedio final: " + this.finalGrade);
        System.out.println("Resultado Final:" + this.estado);
    }
}
