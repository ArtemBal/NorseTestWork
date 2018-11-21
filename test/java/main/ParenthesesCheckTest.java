package main;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ParenthesesCheckTest {

    private ParenthesesCheck parenthesesCheck = new ParenthesesCheck();

    @Test
    void isParentheseIsFine() {

        Assert.assertTrue(parenthesesCheck.isParentheseIsFine("123(324(232)23)3434(343)"));

        Assert.assertFalse(parenthesesCheck.isParentheseIsFine("(()"));
    }

}