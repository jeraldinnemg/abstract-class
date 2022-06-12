public class ImpresoraEpson extends Impresora {

    public ImpresoraEpson(String modelo, String tipoContrato, Integer hojasDisponibles) {
        super(modelo, tipoContrato, hojasDisponibles);
    }

    @Override
    public String imprimir() {
        setHojasDisponibles(getHojasDisponibles()-1);

        setPorcentajeTinta(getPorcentajeTinta()-10.0);
        return "Estoy imprimiendo desde una EPSOn";
    }
}
