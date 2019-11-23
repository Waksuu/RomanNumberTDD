package pl.starzynski.kacper.romanNumbers;

import org.apache.commons.lang3.mutable.MutableInt;

import java.util.List;

class RomanNumbersConverter {
    private List<RomanNumber> romanNumbers;
    private int sum;

    int convert(final List<RomanNumber> romanNumbers) {
        this.romanNumbers = romanNumbers;
        this.sum = 0;

        convertToNumeralValue();
        return sum;
    }

    private void convertToNumeralValue() {
        for (MutableInt i = new MutableInt(0); i.getValue() < romanNumbers.size(); i.increment()) {
            SumStrategy sumStrategy = SumFactory.getSumStrategy(romanNumbers, i.getValue());
            sum += sumStrategy.sumElements(romanNumbers, i);
        }
    }
}

