package calculator.domain;

import static calculator.domain.extractCustomDelimiter.*;

public class UpdateDelimiterList {

    public String[] UpdateDelimiterList(String input) {

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
