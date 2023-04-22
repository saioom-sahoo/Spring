package com.operatorlogicalorrelation.logicalorrelational;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LogicalOrRelational {
    @Value("#{10 == 10}")
    private boolean equal1;
    @Value("#{10 eq 1}")
    private boolean equal2;
    @Value("#{ 1 != 1}")
    private boolean notEqaul1;
    @Value("#{ 1 ne 1}")
    private boolean notEqaul2;
    @Value("#{ 10 < 1}")
    private boolean lessThan;
    @Value("#{20 lt 5}")
    private boolean lessThan1;
    @Value("#{ 1 > 1}")
    private boolean greaterThan;
    @Value("#{5 gt 2}")
    private boolean greaterThan1;

    @Value("#{4 <= 6}")
    private boolean lessThanEqual;
    @Value("#{8 le 6}")
    private boolean lessThanEqual1;
    @Value("#{ 1 >= 1}")
    private boolean greaterThanEqual;
    @Value("#{ 1 ge 1}")
    private boolean greaterThanEqual1;

    @Override
    public String toString() {
        return "LogicalOrRelational [equal1=" + equal1 + ", equal2=" + equal2 + ", notEqaul1=" + notEqaul1
                + ", notEqaul2=" + notEqaul2 + ", lessThan=" + lessThan + ", lessThan1=" + lessThan1 + ", greaterThan="
                + greaterThan + ", greaterThan1=" + greaterThan1 + ", lessThanEqual=" + lessThanEqual
                + ", lessThanEqual1=" + lessThanEqual1 + ", greaterThanEqual=" + greaterThanEqual
                + ", greaterThanEqual1=" + greaterThanEqual1 + "]";
    }
}
