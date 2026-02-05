public class ShippingCalculator {
    /**
     * Metodo para calcular el subtotal del envio.
     * @param pesoKg -> Double
     * @param distance -> Int
     * @param tipoServicio -> Int
     * @param zonaRemota -> Boolean
     * @return -> Double
     */
    public static double calcularSubtotal(double pesoKg, int distance,int tipoServicio, boolean zonaRemota){

        double subtotal = precioPorServicio(tipoServicio) + precioPorPeso(pesoKg) + precioPorDistancia(distance);
        subtotal = precioZonaRemota(subtotal, zonaRemota);

        return subtotal;
    }

    /**
     * Metodo para calcular el IVA.
     * @param subtotal -> Double
     * @return -> Double
     */
    public static double calcularIVA(double subtotal){
        return subtotal * 0.16;
    }

    /**
     * Metodo para calcular el total sumando subtotal e IVA.
     * @param subtotal -> Double
     * @param iva -> Double
     * @return -> Double
     */
    public static double calcularTotal(double subtotal, double iva){
        return subtotal + iva;
    }

    /**
     * Metodo para calcular el monto por el tipo de servicio.
     * @param servicio -> int
     * @return -> int
     */
    private static int precioPorServicio(int servicio){
        if (servicio == 1){
            return 50;
        }else {
            return 90;
        }
    }

    /**
     * Metodo para calcuar el monto añadido por el peso
     * @param peso -> Double
     * @return -> int
     */
    private static int precioPorPeso(double peso){
        int total = 0;
        for (int i = 0; i < Math.floor(peso); i++){
            total = total + 12;
        }
        return total;
    }

    /**
     * Metodo para calcuar el monto añadido por la distancia
     * @param distance -> int
     * @return -> int
     */
    private static int precioPorDistancia(int distance){
        if (distance <= 50){
            return 20;
        } else if (distance <= 200) {
            return 60;
        }else return 120;
    }

    /**
     * Metodo para calcuar el monto añadido por estar en una zona remota
     * @param subtotal -> double
     * @param zonaRemota -> Boolean
     * @return -> double
     */
    private static double precioZonaRemota(double subtotal, boolean zonaRemota){
        if (zonaRemota){
            return  subtotal + (subtotal * 0.10);
        }else return subtotal;
    }

}
