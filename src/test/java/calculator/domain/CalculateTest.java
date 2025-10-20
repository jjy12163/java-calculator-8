package calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    String input_custom = "//;\n1,2;3";
    String input_noCustom = "1,2";

    @Test
    @DisplayName("Calculate 기능 테스트")
    public void Calculate_o() {   // custom된 값이 잘 계산되는지
        Integer result = Calculate.Calculate(input_custom);

        Integer sum = 6;
        assertThat(result).isEqualTo(sum);
    }

    @Test
    @DisplayName("Calculate 기능 테스트")
    public void Calculate1_o() {   // custom된 값이 잘 계산되는지
        Integer result = Calculate.Calculate(input_noCustom);

        Integer sum = 3;
        assertThat(result).isEqualTo(sum);
    }
}
