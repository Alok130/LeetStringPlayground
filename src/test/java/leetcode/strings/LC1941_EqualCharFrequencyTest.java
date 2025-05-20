package leetcode.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LC1941_EqualCharFrequencyTest {

    @Test
    public void testEqualFrequencies_SimpleTrue() {
        assertTrue(LC1941_EqualCharFrequency.areOccurrencesEqual("aabb"));
        assertTrue(LC1941_EqualCharFrequency.areOccurrencesEqualOptimized("aabb"));
    }

    @Test
    public void testEqualFrequencies_SimpleFalse() {
        assertFalse(LC1941_EqualCharFrequency.areOccurrencesEqual("juczjzjlsfkmpv"));
        assertFalse(LC1941_EqualCharFrequency.areOccurrencesEqualOptimized("juczjzjlsfkmpv"));
    }

    @Test
    public void testEqualFrequencies_ComplexTrue() {
        String s = "mmmccmcccccmcccccmmmcmccmmccccmmmcmmcmcmcmcmmmmmmmmmcccmmcmmmcmmcmcmcmmmcmmmcmmccccmcmccmmcmccmmmcmmccccmcmmccmcmmcccmmcmmcmmcmccmmccmcmmcmmccmmccmcccmmcccmmcccccmcmmmmcmccmmmmmmcmmccmccmmcccccccccmcccmmmccmmccccmmcmcmcmcmmcmmcmcmcmccccmmcccmmmccmmcmmmcmmmcmccccmcmcccmmccmm";
        assertTrue(LC1941_EqualCharFrequency.areOccurrencesEqual(s));
        assertTrue(LC1941_EqualCharFrequency.areOccurrencesEqualOptimized(s));
    }

    @Test
    public void testEqualFrequencies_TrueAlternating() {
        assertTrue(LC1941_EqualCharFrequency.areOccurrencesEqual("abacbc"));
        assertTrue(LC1941_EqualCharFrequency.areOccurrencesEqualOptimized("abacbc"));
    }

    @Test
    public void testSingleChar() {
        assertTrue(LC1941_EqualCharFrequency.areOccurrencesEqual("aa"));
        assertTrue(LC1941_EqualCharFrequency.areOccurrencesEqualOptimized("aa"));
    }

    @Test
    public void testAllUniqueChars() {
        assertTrue(LC1941_EqualCharFrequency.areOccurrencesEqual("abc"));
        assertTrue(LC1941_EqualCharFrequency.areOccurrencesEqualOptimized("abc"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(LC1941_EqualCharFrequency.areOccurrencesEqual(""));
        assertTrue(LC1941_EqualCharFrequency.areOccurrencesEqualOptimized(""));
    }

    @Test
    public void testDifferentFrequencies() {
        assertFalse(LC1941_EqualCharFrequency.areOccurrencesEqual("aabbbc"));
        assertFalse(LC1941_EqualCharFrequency.areOccurrencesEqualOptimized("aabbbc"));
    }
}

