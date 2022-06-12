public class Main {
    public static void main(String[] args) {

        Impresora unaImpresora= new ImpresoraEpson("AAA","USB", 10);

        System.out.println("La cantidad de hojas de impresora es:" + unaImpresora.getHojasDisponibles());
        System.out.println("El porcentaje de tinta de impresora es: " + unaImpresora.getPorcentajeTinta());

        System.out.println(unaImpresora.imprimir());

        System.out.println("La cantidad de hojas de impresora Epson es:" + unaImpresora.getHojasDisponibles());
        System.out.println("El porcentaje de tinta de impresora Epson es " + unaImpresora.getPorcentajeTinta());

        // Change impresora
        unaImpresora = new ImpresoraCanon("BBB", "Wifi", 20);
        System.out.println(unaImpresora.imprimir());
        System.out.println("La cantidad de hojas de impresora es: " + unaImpresora.getHojasDisponibles());
        System.out.println("El porcentaje de tinta de impresora es: " + unaImpresora.getPorcentajeTinta());

    }
}