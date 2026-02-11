import java.util.Scanner;

public class PersonaServices {
    static Scanner sc = new Scanner(System.in);

    private static Persona[] personas = new Persona[20];

    public static void alta(){
        int freeSpace = checkFreeSpace();
        if (freeSpace >=0 && freeSpace < 20){
            int id = InputMethods.leerIntEnRango(sc,"Ingresa el ID: ", 0, 20);
            if (validarID(id)){
                String name = InputMethods.leerTextoNoVacio(sc,"Ingresa el nombre de la persona: ");
                personas[freeSpace] = new Persona(id, name, true);
            }
        }
    }

    private static int checkFreeSpace(){
        for (int i = 0; i < personas.length; i++){
            if (personas[i] == null){
                return i;
            }
        }
        return -1;
    }

    private static boolean validarID(int id){
        for (Persona persona : personas) {
            if (persona != null && id == persona.getId()) {
                System.out.println("Ese ID ya esta en uso intenta con uno diferente");
                return false;
            }
        }
        return true;
    }
    
    public static void buscarPorID(int id){
        for (Persona persona: personas) {
            if (persona != null && id == persona.getId() && persona.isActiva()){
                System.out.println("La persona que buscas es: " + persona.toString());
                return;
            }
        }
        System.out.println("No hay ninguna persona con ese ID.");
    }

    public static void listarIDs(){
        for (Persona persona : personas) {
            if (persona != null && persona.isActiva()) {
                System.out.println(persona.toString());
            }
        }
    }

    public static void cambiarNombre(){
        int id = InputMethods.leerIntEnRango(sc, "Ingresa el ID a buscar: ", 0, 100);
        for (Persona persona: personas) {
            if (persona != null && persona.isActiva() && id == persona.getId()){
                persona.setName(InputMethods.leerTextoNoVacio(sc,"Ingresa el nuevo nombre: "));
                return;
            }
        }
        System.out.println("No hay ninguna persona con ese ID.");
    }

    public static void bajaLogica(){
        int id = InputMethods.leerIntEnRango(sc, "Ingresa el ID a dar de baja: ", 0, 100);
        for (Persona persona: personas) {
            if (persona != null && persona.isActiva() && id == persona.getId()){
                persona.setActiva(false);
                return;
            }
        }
        System.out.println("No hay ninguna persona con ese ID.");
    }
}
