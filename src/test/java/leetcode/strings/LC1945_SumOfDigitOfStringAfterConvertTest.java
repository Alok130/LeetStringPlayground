package leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LC1945_SumOfDigitOfStringAfterConvertTest {

    @Test
    public void testExampleCase() {
        assertEquals(36, LC1945_SumOfDigitOfStringAfterConvert.getLucky("iiii", 1));
        assertEquals(36, LC1945_SumOfDigitOfStringAfterConvert.getLuckyUsingStringBuilder("iiii", 1));
    }

    @Test
    public void testWithMultipleTransformations() {
        assertEquals(6, LC1945_SumOfDigitOfStringAfterConvert.getLucky("leetcode", 2));
        assertEquals(6, LC1945_SumOfDigitOfStringAfterConvert.getLuckyUsingStringBuilder("leetcode", 2));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals(1, LC1945_SumOfDigitOfStringAfterConvert.getLucky("a", 1));
        assertEquals(1, LC1945_SumOfDigitOfStringAfterConvert.getLuckyUsingStringBuilder("a", 1));
    }

    @Test
    public void testLongString() {
        assertEquals(5, LC1945_SumOfDigitOfStringAfterConvert.getLucky("zzzz", 2));
        assertEquals(5, LC1945_SumOfDigitOfStringAfterConvert.getLuckyUsingStringBuilder("zzzz", 2));
    }

    @Test
    public void testZeroTransformations() {
        assertEquals(26262626, LC1945_SumOfDigitOfStringAfterConvert.getLucky("zzzz", 0));
        assertEquals(26262626, LC1945_SumOfDigitOfStringAfterConvert.getLuckyUsingStringBuilder("zzzz", 0));
    }

    @Test
    public void testAllLettersOnce() {
        assertEquals(6, LC1945_SumOfDigitOfStringAfterConvert.getLucky("abc", 2)); // "123" -> 1+2+3 = 6
        assertEquals(6, LC1945_SumOfDigitOfStringAfterConvert.getLuckyUsingStringBuilder("abc", 2));
    }

    @Test
    public void testFinalValueSingleDigit() {
        assertEquals(1, LC1945_SumOfDigitOfStringAfterConvert.getLucky("abcd", 3));
        assertEquals(1, LC1945_SumOfDigitOfStringAfterConvert.getLuckyUsingStringBuilder("abcd", 3));
    }
}
