package calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    ArrayList<Integer> intNumArr = new ArrayList<Integer>(Arrays.asList(1,2,3));

    @Test
    @DisplayName("Calculate 기능 테스트")
    public void Calculate_o() {   // custom된 값이 잘 계산되는지
        Integer result = Calculate.Calculate(intNumArr);

        Integer sum = 6;
        assertThat(result).isEqualTo(sum);
    }
}
