package pwo.seq;

import java.math.BigDecimal;

/**
 * klasa implementująca ciąg tribonaciego
 * @author admin
 */
public class TribonacciGenerator extends
        FibonacciGenerator {

    /**
     * metoda TribonacciGenerator
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * metoda reset
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
     * metoda nextTerm
     * @return
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}
