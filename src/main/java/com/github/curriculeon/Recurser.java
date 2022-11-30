package com.github.curriculeon;

// given the following sequence
// 0 -> 1
// 1 -> 1
// 2 -> 2
// 3 -> 3
// 4 -> 5
// 5 -> 8
// define a function f(x) which returns the respective output

public class Recurser {
    // taking previous expected integer and
    // taking previous previous expected integer and
    // he's multiplying those together is how he's getting the current
    public Integer factorial(Integer input) {
        // if it's 0 or 1, then
        if(input == 0 || input == 1) {
            //  it's just 1 at that point
            // factorial(1) = 1
            // factorial(0) = 1
            return 1;
        }
        // factorial(2) = factorial(1) * factorial(0)
        // factorial(3) = factorial(2) * factorial(1)
        // factorial(4) = factorial(3) * factorial(2)
        // factorial(5) = factorial(4) * factorial(3)
        // factorial(input) = factorial(input-1) * factorial(input-2)
        final int previous = factorial(input-1);
        final int previousPrevious = factorial(input-2);
        return previous * previousPrevious;
    }

    // taking previous expected integer and
    // taking previous previous expected integer and
    // he's adding those together is how he's getting the current
    public Integer fibonacci(Integer input) {
        // if it's 0 or 1, then
        if(input == 0 || input == 1) {
            //  it's just 1 at that point
            // factorial(1) = 1
            // factorial(0) = 1
            return 1;
        }
        // factorial(2) = factorial(1) + factorial(0)
        // factorial(3) = factorial(2) + factorial(1)
        // factorial(4) = factorial(3) + factorial(2)
        // factorial(5) = factorial(4) + factorial(3)
        // factorial(input) = factorial(input-1) + factorial(input-2)
        final int previous = factorial(input-1);
        final int previousPrevious = factorial(input-2);
        return previous + previousPrevious;
    }
}
