package pl.starzynski.kacper.romanNumbers;

import java.util.List;
import java.util.Map;

class SumFactory {
    private static final Map<Monotonicity, SumStrategy> sumStrategies = Map.of(
            Monotonicity.RISING, new SubtractSumStrategy(),
            Monotonicity.NOT_RISING, new AddSumStrategy()
    );

    static SumStrategy getSumStrategy(List<RomanNumber> romanNumbers, int i) {
        if (indexIsInBounds(romanNumbers, i) && monotonicityIsRising(romanNumbers, i)) {
            return sumStrategies.get(Monotonicity.RISING);
        }

        return sumStrategies.get(Monotonicity.NOT_RISING);
    }

    private static boolean indexIsInBounds(List<RomanNumber> romanNumbers, int i) {
        return i < romanNumbers.size() - 1;
    }

    private static boolean monotonicityIsRising(List<RomanNumber> romanNumbers, int i) {
        return romanNumbers.get(i).getValue() < romanNumbers.get(i + 1).getValue();
    }

    enum Monotonicity {
        RISING,
        NOT_RISING
    }

}
