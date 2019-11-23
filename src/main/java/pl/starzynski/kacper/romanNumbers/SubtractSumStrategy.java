package pl.starzynski.kacper.romanNumbers;

import org.apache.commons.lang3.mutable.MutableInt;

import java.util.List;

class SubtractSumStrategy extends SumStrategy {
    @Override
    int sumElements(List<RomanNumber> romanNumbers, MutableInt i) {
        int greaterValue = romanNumbers.get(i.getValue() + 1).getValue();
        int lesserValue = romanNumbers.get(i.getValue()).getValue();
        skipNextElement(i);
        return greaterValue - lesserValue;
    }

    private void skipNextElement(MutableInt i) {
        i.increment();
    }
}
