package jcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class XGenerator {
    public static List<Integer> rndi(int n) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt());
        }
        return list;
    }

/*    public static List<Double> generate(Function<Double, Double> f, int n) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           list.add(f.apply())
        }
    }*/
}
