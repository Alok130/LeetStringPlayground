package leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC20_ValidParenthesesCheckTest {

    @Test
    public void testRegularCases() {
        Assertions.assertEquals(true, LC20_ValidParenthesesCheck.isValid("()"));
        Assertions.assertEquals(true, LC20_ValidParenthesesCheck.isValid("[()]"));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValid("({()])"));

        Assertions.assertEquals(true, LC20_ValidParenthesesCheck.isValidUsingArray("()"));
        Assertions.assertEquals(true, LC20_ValidParenthesesCheck.isValidUsingArray("[()]"));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValidUsingArray("({()])"));
    }

    @Test
    public void testSingleParentheses(){
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValid("("));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValid("{"));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValid("["));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValid("]"));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValid("}"));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValid(")"));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValid("A"));

        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValidUsingArray("("));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValidUsingArray("{"));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValidUsingArray("["));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValidUsingArray("]"));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValidUsingArray("}"));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValidUsingArray(")"));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValidUsingArray("A"));
    }

    @Test
    public void testEdgeCases(){
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValid("())"));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValid("(("));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValid(")("));

        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValidUsingArray("())"));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValidUsingArray("(("));
        Assertions.assertEquals(false, LC20_ValidParenthesesCheck.isValidUsingArray(")("));
    }

}
