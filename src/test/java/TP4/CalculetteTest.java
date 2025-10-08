package TP4;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculetteTest {

    @Test
    public void testAddition() {
        Calculette c = new Calculette();
        c.push(1);
        c.push(2);
        c.addition();
        assertEquals(3.0, c.resultat(), 0.001);
    }

    @Test
    public void testDivision() {
        Calculette c = new Calculette();
        c.push(10);
        c.push(2);
        c.division();
        assertEquals(5.0, c.resultat(), 0.001);
    }
}
