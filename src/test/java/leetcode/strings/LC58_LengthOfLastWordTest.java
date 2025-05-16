package leetcode.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LC58_LengthOfLastWordTest {

    @Test
    public void testRegularCases() {
        assertEquals(5, LC58_LengthOfLastWord.lengthOfLastWord("Hello World"));
        assertEquals(4, LC58_LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, LC58_LengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));

        assertEquals(5, LC58_LengthOfLastWord.lengthOfLastWordOptimized("Hello World"));
        assertEquals(4, LC58_LengthOfLastWord.lengthOfLastWordOptimized("   fly me   to   the moon  "));
        assertEquals(6, LC58_LengthOfLastWord.lengthOfLastWordOptimized("luffy is still joyboy"));
    }

    @Test
    public void testSingleWord() {
        assertEquals(1, LC58_LengthOfLastWord.lengthOfLastWord("a"));
        assertEquals(1, LC58_LengthOfLastWord.lengthOfLastWord("   a"));
        assertEquals(4, LC58_LengthOfLastWord.lengthOfLastWord("word   "));

        assertEquals(1, LC58_LengthOfLastWord.lengthOfLastWordOptimized("a"));
        assertEquals(1, LC58_LengthOfLastWord.lengthOfLastWordOptimized("   a"));
        assertEquals(4, LC58_LengthOfLastWord.lengthOfLastWordOptimized("word   "));
    }

    @Test
    public void testEdgeCases() {
        assertEquals(0, LC58_LengthOfLastWord.lengthOfLastWord("   "));
        assertEquals(0, LC58_LengthOfLastWord.lengthOfLastWord(""));

        assertEquals(0, LC58_LengthOfLastWord.lengthOfLastWordOptimized("   "));
        assertEquals(0, LC58_LengthOfLastWord.lengthOfLastWordOptimized(""));
    }
}

