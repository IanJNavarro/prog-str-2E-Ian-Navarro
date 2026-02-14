public class StudentService {
    private final Student[] students = new Student[25];

    /**
     * Metodo para añadir un estudiante al arreglo de estudiantes.
     * @param student -> objeto estudiante a agregar.
     */
    public void altaEstudiante(Student student){
        int freeSpace = checkFreeSpace();
        if (freeSpace >= 0) {
            if (idFree(student.getId())) {
                student.setState(true);
                students[freeSpace] = student;
            }else System.out.println("Ese ID ya esta en uso.");
        }else System.out.println("El cupo de estudiantes esta lleno.");
    }

    /**
     * Metodo para buscar estudiante por ID
     * @param id -> int id de estudiante
     */
    public void buscarPorID(int id){
        for (Student student : students){
            if (student != null && student.getState() && student.getId() == id){
                System.out.println(student.toString());
            }
        }
    }

    /**
     * Metodo para buscar estudiante por ID y cambiar su promedio
     * @param id -> int id de estudiante
     * @param newGrade -> double nuevo promedio
     */
    public void actualizarPromedioPorID(int id, double newGrade){
        for (Student student : students){
            if (student != null && student.getId() == id){
                student.setGrade(newGrade);
            }
        }
    }

    /**
     * Metodo para dar de baja a un estudiante mediante su ID.
     * @param id -> int id de estudiante
     */
    public void bajaEstudiante(int id){
        for (Student student : students){
            if (student != null && student.getId() == id){
                student.setState(false);
            }
        }

    }

    /**
     * Metodo para listar a los estudiantes activos en el arreglo.
     */
    public void listarActivos(){
        System.out.println("Lista de estudiantes:");
        for (Student student : students){
            if (student != null && student.getState()){
                System.out.println("----------------------------");
                System.out.println("Estudiante: " + student.getName());
                System.out.println("ID: " + student.getId());
                System.out.println("----------------------------");
            }
        }
    }

    /**
     * Metodo para listar los reportes de todos los estudiantes activos.
     */
    public void reportes(){
        System.out.println("Reportes de estudiantes:");
        for (Student student : students){
            if (student != null && student.getState()){
                System.out.println("----------------------------");
                System.out.println(student.toString());
                System.out.println("----------------------------");
            }
        }
    }

    /**
     * Metodo para identificar si el ID no ha sido utilizado previamente en el arreglo.
     * @param id -> int id de estudiante
     * @return -> Boolean
     */
    private boolean idFree(int id){
        for (Student student : students){
            if (student != null && student.getId() == id ){
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo para identificar si hay espacio en el arreglo para agregar otro estudiante.
     * @return -> int posicion disponible en el arreglo
     */
    private int checkFreeSpace(){
        for (int i = 0 ; i < students.length ; i++){
            if (students[i] == null){
                return i;
            }
        }
        return -1;
    }

}
