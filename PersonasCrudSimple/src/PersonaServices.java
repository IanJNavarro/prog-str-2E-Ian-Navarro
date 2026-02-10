
public class PersonaServices {

    private static Persona[] personas = new Persona[20];
    
    public static void alta(){
        personas[1].setId(validarID());
    }
    
    private static int validarID(){
        int id = InputMethods.leerIntEnRango("Ingresa el ID de la persona: ",0,100);

        for (int i = 0; i < personas.length; i++) {
            
        } (Persona persona: personas) {
            if ( id == persona.getId()) {
                System.out.println("Ese ID ya esta en uso intenta con uno diferente");
                break;
            }else return id;
        }
        return 0;
    }
    
    public static void buscarPorID(Persona[] personas, int id){
        for (Persona persona: personas) {
            if (id == persona.getId()){
                System.out.println("La persona que buscas es: " + persona.toString());
                break;
            }
        }
        System.out.println("No hay ninguna persona con ese ID.");
    }
}
