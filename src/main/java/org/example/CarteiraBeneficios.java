package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CarteiraBeneficios implements Iterable<Beneficio> {

    private List<Beneficio> beneficios = new ArrayList<Beneficio>();

    public CarteiraBeneficios(Beneficio... beneficios) {
        this.beneficios = Arrays.asList(beneficios);
    }

    @Override
    public Iterator<Beneficio> iterator() {
        return beneficios.iterator();
    }
}