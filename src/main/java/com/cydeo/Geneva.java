package com.cydeo;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class Geneva {

    private Integer id;
    private LinkedHashMap<BigDecimal, Boolean> map;
    protected static String str;

    public Integer getId() {
        return id;
    }

    public LinkedHashMap<BigDecimal, Boolean> getMap() {
        return map;
    }

    public Geneva(Integer id){

        setId(id);
    }

    private void setId(Integer id) {
        if (id < -18){

            throw new RuntimeException();

        }else this.id = id;
    }

    void method1 (int number){

    }

    void method1 (long number){

    }
}
