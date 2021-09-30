package com.kodilla.patterns.builder.bicmac;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicmacTestSuite {

    public static Bicmac bicmac;

    @BeforeAll
    static void Bicmac() {
        bicmac = new Bicmac.BicmacBuilder().Bun("sezam").Sauce("barbecue").Burgers(4).Ingradients("salat")
                .Ingradients("becon").Ingradients("Chesse").build();
    }

    @Test
    void testBicmacNew() {

        System.out.println(bicmac);
        assertEquals(3,bicmac.getIngradients().size());
    }

    @Test
    void testBicmacgetBun(){

        assertEquals("sezam",bicmac.getBun());
    }
}
