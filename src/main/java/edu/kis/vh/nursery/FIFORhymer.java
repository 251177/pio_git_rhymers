package edu.kis.vh.nursery;

/**
 * Kolejka FIFO (First In First Out) implementująca specyficzny wariant wyliczanki.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     * Zapasowy wyliczacz (stos) wykorzystywany do odwracania kolejności elementów.
     */
    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Zwraca i usuwa pierwszy dodany element do wyliczanki (zgodnie z zasadą FIFO).
     *
     * @return wartość pierwszego elementu w kolejce
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}