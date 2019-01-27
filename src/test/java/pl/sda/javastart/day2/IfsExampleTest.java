package pl.sda.javastart.day2;

import org.junit.Test;

import static org.junit.Assert.*;

public class IfsExampleTest {

    @Test
    public void shouldNotAnswerBecauseWeAreAsleep() {
        boolean mum=true;
        boolean isMorning=true;
        boolean isAsleep=true;

        boolean result = IfsExample.answerCell(mum, isMorning, isAsleep);

        assertFalse(result);
    }

    @Test
    public void shouldNotAnswerBecauseWeAreNotAsleepAndItIsMorningAndItIsMum() {
        boolean mum=false;
        boolean isMorning=true;
        boolean isAsleep=false;

        boolean result = IfsExample.answerCell(mum, isMorning, isAsleep);

        assertFalse(result);
    }
}