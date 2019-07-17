package jcalculator;

import org.codehaus.janino.*;

import java.util.*;


public class Expression {
    public String execute(String expression) throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        ee.setDefaultImports(new String[]{
                "static jcalculator.XMath.*",
                "static jcalculator.XGenerator.*"
        });
        ee.cook(expression);
        String s = "";
        Object o = ee.evaluate(null);
        if (o instanceof Collection<?>) {
            for (Object item : (Collection<?>) o) {
                s += item + "\n";
            }
        } else if (o instanceof Object[]) {
            for (Object item : (Object[]) o) {
                s += item + "\n";
            }
        } else {
            s = o + "";
        }
        return s;
    }


}
