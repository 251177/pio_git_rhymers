package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerTest {

    @Test
    public void testCountOut() {
        FIFORhymer rhymer = new FIFORhymer();

        // liczby
        rhymer.countIn(4);
        rhymer.countIn(7);

        // Zgodnie z FIFO, pierwsza wrzucona liczba (4) powinna wyjść jako pierwsza
        int result = rhymer.countOut();
        Assert.assertEquals(4, result);
    }
}