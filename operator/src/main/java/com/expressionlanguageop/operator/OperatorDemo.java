package com.expressionlanguageop.operator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OperatorDemo {

    @Value("#{10 + 2}")
    private double add;

    // @Value("#{java + Technocrat}")
    // private String addString;

    @Value("#{20 - 10}")
    private double sub;

    @Value("#{2 * 5}")
    private double mul;

    @Value("#{10/2}")
    private double divide1;

    @Value("#{24 div 2}")
    private double divide2;

    @Value("#{15 % 10}")
    private double mol1;

    @Value("#{35 mod 10}")
    private double mol2;

    @Value("#{5 ^ 2}")
    private double power;

    @Value("#{(1+1)*2 + 1}")
    private double brackets;

    public double getAdd() {
        return add;
    }

    // public String getAddString() {
    // return addString;
    // }

    public double getSub() {
        return sub;
    }

    public double getMul() {
        return mul;
    }

    public double getDivide1() {
        return divide1;
    }

    public double getDivide2() {
        return divide2;
    }

    public double getMol1() {
        return mol1;
    }

    public double getMol2() {
        return mol2;
    }

    public double getPower() {
        return power;
    }

    public double getBrackets() {
        return brackets;
    }

    @Override
    public String toString() {
        return "OperatorDemo [add=" + add + ", sub=" + sub + ", mul=" + mul + ", divide1=" + divide1 + ", divide2="
                + divide2 + ", mol1=" + mol1 + ", mol2=" + mol2 + ", power=" + power + ", brackets=" + brackets + "]";
    }

}
