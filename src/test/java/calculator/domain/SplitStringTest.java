package calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitStringTest {

    String input_custom = "//;\n1,2";
    String input_noCustom = "1,2";
    String input_error = "//;\n1$2";

    @Test
    @DisplayName("SplitString 기능 테스트_o")
    public void SplitStringTest_o() {   // 구분자 리스트를 기준으로 잘 split되는지 + 정수로 변환
        ArrayList<Integer> result = SplitString.SplitString(input_custom);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("SplitString 기능 테스트_o")
    public void SplitStringTest_o_noCustom() {
        // 구분자 없는 경우에도 구분자 리스트를 기준으로 잘 split되는지 + 정수로 변환
        ArrayList<Integer> result = SplitString.SplitString(input_noCustom);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        assertThat(result).isEqualTo(expected);
    }


    @Test
    @DisplayName("SplitString 기능 테스트_x")
    public void SplitStringTest_x_numFormatError() {   // NumberFormatExceptiond 에러
        try {
            ArrayList<Integer> result = SplitString.SplitString(input_error);

            ArrayList<Integer> expected = new ArrayList<>();
            expected.add(1);
            expected.add(2);
            assertThat(result).isEqualTo(expected);
        } catch(IllegalArgumentException e) {
            assertEquals("지정되지 않은 문자", e.getMessage());
        }
    }



}
