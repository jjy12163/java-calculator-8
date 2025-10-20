package calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class extractCustomDelimiterTest {

    String input_custom = "//;\n1,2";
    String input_noCustom = "1,2";

    @Test
    @DisplayName("isExistCustomDelimiter 기능 테스트_o")
    public void isExistCustomDelimiterTest_o() {   // custom 되어있는지 => yes
        boolean result = extractCustomDelimiter.isExistCustomDelimiter(input_custom);

        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("isExistCustomDelimiter 기능 테스트_x")
    public void isExistCustomDelimiterTest_x() {   // custom 되어있는지 => no
        boolean result = extractCustomDelimiter.isExistCustomDelimiter(input_noCustom);

        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("extractCustomDelimiterTest 기능 테스트_o")
    public void extractCustomDelimiterTest_o() {   // 커스텀 구분자가 제대로 추출되는지
        String result = extractCustomDelimiter.extractCustomDelimiter(input_custom);

        String expected = ";";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("extractCustomDelimiterTest 기능 테스트_x")
    public void extractCustomDelimiterTest_x() {   // 커스텀 구분자가 제대로 추출되는지

        try {
            String result = extractCustomDelimiter.extractCustomDelimiter(input_noCustom);
        } catch(IllegalArgumentException e) {
            assertEquals("커스텀 구분자가 없는 input입니다.", e.getMessage());
        }
    }

    @Test
    @DisplayName("notCustomDelimiterTest 기능 테스트_o")
    public void notCustomDelimiterTest_o() {   // 커스텀 구분자 없앤 계산식이 만들어지는지
        String result = extractCustomDelimiter.notCustomDelimiter(input_custom);

        assertThat(result).isEqualTo(input_noCustom);
    }

    @Test
    @DisplayName("notCustomDelimiterTest 기능 테스트_x")
    public void notCustomDelimiterTest_x() {   // 커스텀 구분자 없앤 계산식이 들어갈 경우
        try {
            String result = extractCustomDelimiter.notCustomDelimiter(input_custom);
            assertThat(result).isEqualTo(input_noCustom);
        } catch(IllegalArgumentException e) {
            assertEquals("이미 커스텀 구분자가 없는 계산식입니다.", e.getMessage());
        }
    }

}
