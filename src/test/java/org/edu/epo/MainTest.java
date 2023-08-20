package org.edu.epo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {
    private final Calculator calculator = new Calculator();
    @Test
    void addition (){
        assertEquals(2, calculator.add(1,1));
        assertEquals(12,calculator.add(3,9));
    }
}
