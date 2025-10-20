package calculator.domain;

import java.util.ArrayList;

public class Calculate {
    public static Integer Calculate(String input) {

        UpdateDelimiterList.UpdateDelimiterList(input);

        ArrayList<Integer> intNumArr = SplitString.SplitString(input);
        int sum = 0;
        for(Integer num : intNumArr) {
            sum += num;
        }
        return sum;
    }
}
