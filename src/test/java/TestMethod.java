import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestMethod {

    @Test
    public void testTaskFirst() {


        TaskFirst taskFirst = new TaskFirst();
        int[] threeMaxNumbers = taskFirst.threeMaxNumbers(new int[]{1, 2, 34, 56, 7, 124, 12, 25, 6,});

        assertEquals(124, threeMaxNumbers[0]);
        assertEquals(56, threeMaxNumbers[1]);
        assertEquals(34, threeMaxNumbers[2]);
        assertEquals(null, taskFirst.threeMaxNumbers(new int[]{1}));
    }

    @Test
    public void testTaskTwo() {
        TaskTwo taskTwo = new TaskTwo();

        int resultFirst = taskTwo.sumDigitNumber(123345124);
        int resultTwo = taskTwo.sumDigitNumber(123345124 * (-1));
        int resultThree = taskTwo.sumDigitNumber(0);

        assertEquals(25, resultFirst);
        assertEquals(25, resultTwo);
        assertEquals(0, resultThree);


    }
}
