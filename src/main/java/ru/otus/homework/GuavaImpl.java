package ru.otus.homework;

import com.google.common.math.IntMath;

public class GuavaImpl {

    public Integer checkIsPowerTwo(Integer number) {
        if (IntMath.isPowerOfTwo(number)) {
            System.out.println(number + " is power of 2");
        } else {
            System.out.println(number + " is not power of 2");
        }
        return number;
    }
}
