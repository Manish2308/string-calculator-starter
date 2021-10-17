package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(stringCalculator.calculate(""), 0);
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(stringCalculator.add("1"), 1);
    }

    @Test
    void two_numbers_deliter_and_return_sum() {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(stringCalculator.add("1,2"), 3);
    }
}
