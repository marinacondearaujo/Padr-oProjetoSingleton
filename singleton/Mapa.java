package padroescriacao_exercicios.singleton;

public class Mapa {
    private Mapa() {};
    private static Mapa instance = new Mapa();
    public static Mapa getInstance() {
        return instance;
    }

    private String Mapa;
    private String Pais;

    public String getMapa() {
        return Mapa;
    }

    public void setMapa(String mapa) {
        this.Mapa = mapa;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        this.Pais = pais;
    }
}
