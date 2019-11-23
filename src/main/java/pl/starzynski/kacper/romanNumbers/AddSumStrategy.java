package pl.starzynski.kacper.romanNumbers;

import org.apache.commons.lang3.mutable.MutableInt;

import java.util.List;

class AddSumStrategy extends SumStrategy {
    @Override
    int sumElements(List<RomanNumber> romanNumbers, MutableInt i) {
        return romanNumbers.get(i.getValue()).getValue();
    }
}
