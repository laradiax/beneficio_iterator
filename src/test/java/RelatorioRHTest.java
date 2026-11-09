import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioRHTest {

    @Test
    void deveContarBeneficiosAtivos() {
        CarteiraBeneficios carteira = new CarteiraBeneficios(
                new Beneficio("Ana", "Vale-Refeição", true),
                new Beneficio("Antonio", "Vale-Transporte", true),
                new Beneficio("Jose", "Plano de Saúde", false),
                new Beneficio("Maria", "Previdência Privada", true)
        );

        assertEquals(3, RelatorioRH.contarBeneficiosAtivos(carteira));
    }

    @Test
    void deveContarTotalBeneficios() {
        CarteiraBeneficios carteira = new CarteiraBeneficios(
                new Beneficio("Ana", "Vale-Refeição", true),
                new Beneficio("Antonio", "Vale-Transporte", true),
                new Beneficio("Jose", "Plano de Saúde", false),
                new Beneficio("Maria", "Previdência Privada", true)
        );

        assertEquals(4, RelatorioRH.contarTotalBeneficios(carteira));
    }
}