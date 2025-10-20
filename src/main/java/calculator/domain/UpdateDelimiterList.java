package calculator.domain;

import static calculator.domain.extractCustomDelimiter.*;

public class UpdateDelimiterList {

    public static String[] UpdateDelimiterList(String input) {   // 지정자의 리스트 반환

        String[] delimiterList;
        if(isExistCustomDelimiter(input)) {
            String customDelimiter = extractCustomDelimiter(input);
            delimiterList = new String[]{",", ":", customDelimiter};
        } else {
            delimiterList = new String[]{",", ":"};
        }
        return delimiterList;
    }


}
