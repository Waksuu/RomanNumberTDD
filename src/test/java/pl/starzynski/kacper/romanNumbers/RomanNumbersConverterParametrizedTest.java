package pl.starzynski.kacper.romanNumbers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RomanNumbersConverterParametrizedTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Collections.emptyList(), 0},
                {Collections.singletonList(RomanNumber.I), 1},
                {Collections.singletonList(RomanNumber.V), 5},
                {Collections.singletonList(RomanNumber.X), 10},
                {Collections.singletonList(RomanNumber.L), 50},
                {Collections.singletonList(RomanNumber.C), 100},
                {Collections.singletonList(RomanNumber.D), 500},
                {Collections.singletonList(RomanNumber.M), 1000},

                {Arrays.asList(RomanNumber.I, RomanNumber.I), 2},
                {Arrays.asList(RomanNumber.V, RomanNumber.I), 6},
                {Arrays.asList(RomanNumber.I, RomanNumber.V), 4},
                {Arrays.asList(
                        RomanNumber.V, RomanNumber.I, RomanNumber.I,
                        RomanNumber.I),
                        8},
                {Arrays.asList(RomanNumber.I, RomanNumber.X), 9},
                {Arrays.asList(
                        RomanNumber.M, RomanNumber.M, RomanNumber.V,
                        RomanNumber.I),
                        2006},
                {Arrays.asList(
                        RomanNumber.M, RomanNumber.C, RomanNumber.M,
                        RomanNumber.X, RomanNumber.L, RomanNumber.I,
                        RomanNumber.V),
                        1944},
        });
    }

    private List<RomanNumber> romanInput;
    private int expectedValue;

    public RomanNumbersConverterParametrizedTest(List<RomanNumber> romanInput, int expectedValue) {
        this.romanInput = romanInput;
        this.expectedValue = expectedValue;
    }

    @Test
    public void shouldReturnCorrespondingRomanValue() {
        // Arrange
        RomanNumbersConverter converter = new RomanNumbersConverter();

        // Assert
        assertEquals(expectedValue, converter.convert(romanInput));
    }

}
