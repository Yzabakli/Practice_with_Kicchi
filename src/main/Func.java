package main;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

@FunctionalInterface
public interface Func {

    LinkedList<BigDecimal> apply(List<Long> list);
}
