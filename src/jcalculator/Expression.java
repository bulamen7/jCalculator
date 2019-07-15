package jcalculator;

import org.codehaus.janino.*;

public class Expression {
    public String execute(String expression) throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        ee.cook(expression);
        return ee.evaluate(null) + "";
    }


}
