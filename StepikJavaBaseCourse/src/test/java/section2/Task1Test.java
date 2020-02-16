package section2;

import org.junit.Test;
import section2.task1.Task1;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void booleanExpressionTest1() {
        //false
        assertFalse(Task1.booleanExpression(false,false,false, false));
        assertFalse(Task1.booleanExpression(false,false,false,true));
        assertFalse(Task1.booleanExpression(false,false,true,false));
        assertFalse(Task1.booleanExpression(false,true,false,false));
        assertFalse(Task1.booleanExpression(false,true,true,true));
        assertFalse(Task1.booleanExpression(true,false,false,false));
        assertFalse(Task1.booleanExpression(true,false,true,true));
        assertFalse(Task1.booleanExpression(true,true,false,true));
        assertFalse(Task1.booleanExpression(true,true,true,false));
        assertFalse(Task1.booleanExpression(true,true,true,true));

        //true
        assertTrue(Task1.booleanExpression(false,false,true, true));
        assertTrue(Task1.booleanExpression(false,true,false,true));
        assertTrue(Task1.booleanExpression(false,true,true,false));
        assertTrue(Task1.booleanExpression(true,false,false,true));
        assertTrue(Task1.booleanExpression(true,false,true,false));
        assertTrue(Task1.booleanExpression(true,true,false,false));
    }

}