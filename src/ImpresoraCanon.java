public class ImpresoraCanon extends Impresora {
    public ImpresoraCanon(String modelo, String tipoContrato, Integer hojasDisponibles) {
        super(modelo, tipoContrato, hojasDisponibles);
    }

    @Override
    public String imprimir() {
        setHojasDisponibles(getHojasDisponibles()-1);

        setPorcentajeTinta(getPorcentajeTinta()-10.0);
        return "Estoy imprimiendo desde una Canon";
    }

    @Override
    public Boolean necesitaTinta() {
        return getPorcentajeTinta() <= 15;
    }
}
