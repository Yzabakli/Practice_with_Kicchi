package main;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Runner2 {
    public static void main(String[] args) {

        Func obj = new Func() {
            @Override
            public LinkedList<BigDecimal> apply(List<Long> list) {
                return null;
            }
        };

        Func obj2 = list -> new LinkedList<>();

    }
}
