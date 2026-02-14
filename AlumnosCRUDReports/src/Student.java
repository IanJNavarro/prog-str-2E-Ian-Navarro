public class Student {
    private int id;
    private String name;
    private double grade;
    private boolean state;

    public Student() {
    }

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Estudiante: " + name + '\n' +
                "ID: " + id + '\n' +
                "Promedio: " + grade + '\n' +
                "Estado activo: " + state;
    }
}
