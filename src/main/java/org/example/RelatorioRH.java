package org.example;

import java.util.Iterator;

public class RelatorioRH {

    public static Integer contarBeneficiosAtivos(CarteiraBeneficios carteira) {
        int quantidade = 0;

        for (Beneficio beneficio : carteira) {
            if (beneficio.isAtivo()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static Integer contarTotalBeneficios(CarteiraBeneficios carteira) {
        int quantidade = 0;

        for (Iterator a = carteira.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }

        return quantidade;
    }
}