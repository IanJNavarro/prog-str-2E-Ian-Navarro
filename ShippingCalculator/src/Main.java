import java.util.Scanner;

public class Main {
    static double PESOMIN = 0.1;
    static  double PESOMAX = 50.0;
    static int DISTANCIAMIN = 1;
    static int DISTANCIAMAX = 2000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("El siguiente programa calcula el costo de envio de un producto en base a la distancia, peso y otros factores.");

        double pesoKg = Lectura.leerDoubleEnRango(sc, "Ingresa el peso del producto a enviar: (Maximo 50 Kg)", PESOMIN, PESOMAX);
        int distanciaKm = Lectura.leerIntEnRango(sc, "Ingrsa la distancia del envio: (Maximo 2000 Km)", DISTANCIAMIN, DISTANCIAMAX);
        int tipoServicio = Lectura.leerIntEnRango(sc, "Elige el tipo de servicio: (1) Estandar (2) Express", 0, 2);
        boolean zonaRural = Lectura.leerBoolean(sc,"Es una zona rural? (escribe solamente si o no)");

        double subtotal = ShippingCalculator.calcularSubtotal(pesoKg, distanciaKm, tipoServicio, zonaRural);
        double iva = ShippingCalculator.calcularIVA(subtotal);
        double total = ShippingCalculator.calcularTotal(subtotal, iva);

        Ticket ticket1 = new Ticket(tipoServicio, pesoKg, distanciaKm, zonaRural, subtotal, iva, total);

        ticket1.printTicket();


    }

}