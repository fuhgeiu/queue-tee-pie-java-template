package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KittyTest {

    @Test
    public void TestKitty() {

        Kitty kitty = new Kitty(3);
        Kitty kitty2 = new Kitty(9);

        Kitty kitty3 = new Kitty("a very round cat",5);

        assertEquals(kitty.cutenessRating(),3);
        assertEquals(kitty2.cutenessRating(),9);

        assertEquals(kitty3.cutenessRating(),5);
        assertEquals(kitty3.description(),"a very round cat");
    }

}