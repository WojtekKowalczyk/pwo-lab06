package pwo.seq;

import java.math.BigDecimal;

/**
 * Interfejs dowolnego generatora liczbowego o wyrazach zdefiniowanych w
 * zakresie od 0.
 *
 *
 * @version 1.0.0
 */
public class LucasGenerator extends FibonacciGenerator {

    /**
     * Powoduje, że metoda {@link #nextTerm()} rozpoczyna od 0.<br>
     * Nie wpywan na działanie metody {@link #getTerm(int)}.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Zwraca koleny wyraz ciągu.
     *
     * @return Wartość wyrazu ciągu
     * @see #getTerm(int)
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     *
     * @return
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}
