public class Ticket {
    int servicio;
    double peso;
    int distance;
    boolean zonaRemota;
    double subtotal;
    double iva;
    double total;

    /**
     * Metodo Constrctor de objeto.
     * @param servicio -> Asignacion de atributo Tipo de servicio
     * @param peso -> Asignacion de atributo Peso
     * @param distance -> Asignacion de atributo Distancia
     * @param zonaRemota -> Asignacion de atributo Zona Remota
     * @param subtotal -> Asignacion de atributo Subtota
     * @param iva -> Asignacion de atributo IVA
     * @param total -> Asignacion de atributo Total
     */
    public Ticket(int servicio,
        double peso,
        int distance,
        boolean zonaRemota,
        double subtotal,
        double iva,
        double total){
        this.servicio = servicio;
        this.peso = peso;
        this.distance = distance;
        this.zonaRemota = zonaRemota;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

    /**
     * Metodo para mostrar el ticket con todos sus atributos
     */
    public void printTicket(){
        System.out.println("------------------TICKET-------------------");
        System.out.println("Tipo de sevicio: " + this.servicio);
        System.out.println("Peso del paquete: " + this.peso);
        System.out.println("Distancia del envio: " + this.distance);
        System.out.println("Zona remota: " + this.zonaRemota);
        System.out.println("--------------------------------------------");
        System.out.println("Subtotal: " + this.subtotal);
        System.out.println("IVA: " + this.iva);
        System.out.println("TOTAL: " + this.total);
    }


}
