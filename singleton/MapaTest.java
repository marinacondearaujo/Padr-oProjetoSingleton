package padroescriacaoteste_exercicios.singleton;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.singleton.Mapa;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapaTest {
    @Test
    public void deveRetornarMapa() {
        Mapa.getInstance().setMapa("Mapa");
        assertEquals("Mapa", Mapa.getInstance().getMapa());
    }

    @Test
    public void deveRetornarPais() {
        Mapa.getInstance().setPais("Brasil");
        assertEquals("Brasil", Mapa.getInstance().getPais());
    }

}
