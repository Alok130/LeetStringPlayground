package leetcode.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LC28_IndexOfFirstOccurrenceInStringTest {

    @Test
    public void testExactMatch() {
        assertEquals(0, LC28_IndexOfFirstOccurrenceInString.strStr("a", "a"));
        assertEquals(0, LC28_IndexOfFirstOccurrenceInString.strStrSecMethod("a", "a"));
    }

    @Test
    public void testMultipleOccurrences() {
        assertEquals(0, LC28_IndexOfFirstOccurrenceInString.strStr("sadbutsad", "sad"));
        assertEquals(0, LC28_IndexOfFirstOccurrenceInString.strStrSecMethod("sadbutsad", "sad"));
    }

    @Test
    public void testNoMatch() {
        assertEquals(-1, LC28_IndexOfFirstOccurrenceInString.strStr("leetcode", "leeto"));
        assertEquals(-1, LC28_IndexOfFirstOccurrenceInString.strStrSecMethod("leetcode", "leeto"));
    }

    @Test
    public void testEmptyNeedle() {
        assertEquals(0, LC28_IndexOfFirstOccurrenceInString.strStr("anystring", ""));
        assertEquals(0, LC28_IndexOfFirstOccurrenceInString.strStrSecMethod("anystring", ""));
    }

    @Test
    public void testEmptyHaystack() {
        assertEquals(-1, LC28_IndexOfFirstOccurrenceInString.strStr("", "a"));
        assertEquals(-1, LC28_IndexOfFirstOccurrenceInString.strStrSecMethod("", "a"));
    }

    @Test
    public void testBothEmpty() {
        assertEquals(0, LC28_IndexOfFirstOccurrenceInString.strStr("", ""));
        assertEquals(0, LC28_IndexOfFirstOccurrenceInString.strStrSecMethod("", ""));
    }

    @Test
    public void testNeedleLongerThanHaystack() {
        assertEquals(-1, LC28_IndexOfFirstOccurrenceInString.strStr("short", "longerneedle"));
        assertEquals(-1, LC28_IndexOfFirstOccurrenceInString.strStrSecMethod("short", "longerneedle"));
    }
}
