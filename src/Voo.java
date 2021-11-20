import java.util.ArrayList;

public class Voo {

    private String destino;
    private String saida;
    private Integer codigo;

    ArrayList<Passageiro> tripulantes = new ArrayList<Passageiro>();


    public Voo() {

    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Passageiro> getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(ArrayList<Passageiro> tripulantes) {
        this.tripulantes = tripulantes;
    }
}
