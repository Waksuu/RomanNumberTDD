package pl.starzynski.kacper.romanNumbers;

import org.apache.commons.lang3.mutable.MutableInt;

import java.util.List;

abstract class SumStrategy {
    abstract int sumElements(List<RomanNumber> romanNumbers, MutableInt i);
}
