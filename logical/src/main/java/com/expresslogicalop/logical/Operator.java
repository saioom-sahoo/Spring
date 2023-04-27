package com.expresslogicalop.logical;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Operator
 */
@Component
public class Operator {
    @Value("#{250 > 200 && 200 < 400}")
    private boolean and;
    @Value("#{250 > 200 and 200 < 400}")
    private boolean and1;
    @Value("#{250 > 200 || 200 < 400}")
    private boolean or;
    @Value("#{250 > 200 or 200 < 400}")
    private boolean or1;
    @Value("#{!true}")
    private boolean not;
    @Value("#{not true}")
    private boolean not1;

    public boolean isAnd() {
        return and;
    }

    public boolean isAnd1() {
        return and1;
    }

    public boolean isOr() {
        return or;
    }

    @Override
    public String toString() {
        return "Operator [and=" + and + ", and1=" + and1 + ", or=" + or + ", or1=" + or1 + ", not=" + not + ", not1="
                + not1 + "]";
    }

    public boolean isOr1() {
        return or1;
    }

    public boolean isNot() {
        return not;
    }

    public boolean isNot1() {
        return not1;
    }

}