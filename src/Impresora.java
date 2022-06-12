import java.util.Date;

public abstract class Impresora {
    private String modelo;
    private String tipoContrato;
    private Date fechaFabricacion;
    private Integer hojasDisponibles;
    private Double porcentajeTinta;

    public Impresora(String modelo, String tipoContrato, Integer hojasDisponibles) {
        this.modelo = modelo;
        this.tipoContrato = tipoContrato;
        this.hojasDisponibles = hojasDisponibles;
        fechaFabricacion = new Date();
        porcentajeTinta= 100.0;
    }

    public Boolean tienePapel(){
        return hojasDisponibles>0;
    }

    public Boolean necesitaTinta(){
        return porcentajeTinta==0;
    }

    public abstract String imprimir();

    public Integer getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(Integer hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public Double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    public void setPorcentajeTinta(Double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }
}
