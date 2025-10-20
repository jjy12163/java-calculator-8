package calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UpdateDelimiterListTest {

    String input_custom = "//;\n1,2";
    String input_noCustom = "1,2";
    String input_longCustom = "//aa\n1,2";

    @Test
    @DisplayName("UpdateDelimiterList 기능 테스트_o")
    public void UpdateDelimiterListTest_o() {   // 구분자 리스트가 제대로 잘 만들어 지는지
        String[] result = UpdateDelimiterList.UpdateDelimiterList(input_custom);
        String[] expected = {",", ":", ";"};
        assertThat(result).isEqualTo(expected);

    }

    @Test
    @DisplayName("UpdateDelimiterList 기능 테스트_구분자_long.ver")
    public void UpdateDelimiterListTest_delim_longVer() {
        String[] result = UpdateDelimiterList.UpdateDelimiterList(input_longCustom);
        String[] expected = {",", ":", "aa"};
        assertThat(result).isEqualTo(expected);

    }





}
