package teste;

import org.junit.jupiter.api.Test;
import problema2.PerecheNumbere;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class testefib {
    @Test
    void test_fib() {
        PerecheNumbere pn = new PerecheNumbere(1, 1);
        assertEquals(true, pn.consec_fibonaci());
    }
    @Test
    void test_cmmc() {
        PerecheNumbere pn = new PerecheNumbere(3, 16);
        assertEquals(48, pn.cmmmc());
    }
    @Test
    void test_suma() {
        PerecheNumbere pn = new PerecheNumbere(15, 123);
        assertEquals(true, pn.suma_cifrelor());
    }
    @Test
    void test_cifre_pare() {
        PerecheNumbere pn = new PerecheNumbere(248, 842);
        assertEquals(true, pn.cifre_pare());
    }
}
