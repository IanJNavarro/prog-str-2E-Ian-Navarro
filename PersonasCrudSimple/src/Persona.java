public class Persona {
    private int id;
    private String name;
    private boolean activa;

    public Persona() {
    }

    public Persona(int id, String name, boolean activa) {
        this.id = id;
        this.name = name;
        this.activa = activa;
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

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", activa=").append(activa);
        sb.append('}');
        return sb.toString();
    }
}
