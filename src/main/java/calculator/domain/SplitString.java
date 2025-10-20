package calculator.domain;

import java.util.ArrayList;

import static calculator.domain.extractCustomDelimiter.*;
import static calculator.domain.UpdateDelimiterList.*;

public class SplitString {

    public static ArrayList<Integer> SplitString(String input) {

        String[] numArr = new String[0];
        ArrayList<Integer> intNumArr = new ArrayList<>();

        try {// 구분자 리스트
            String[] delimiterList;
            String delimiterListStr;    // delimiterList에 있는 구분자를 "|"로 합함
            delimiterList = UpdateDelimiterList(input);

            if (isExistCustomDelimiter(input)) {  // custom 구분자가 있을 경우
                input = notCustomDelimiter(input);
            }

            // delimiter대로 input을 split - num만 남음
            delimiterListStr = String.join("|", delimiterList);

            numArr = input.split(delimiterListStr);

            // num에 문자열 남아있는 경우 - 에러 발생
            for(String num : numArr) {
                intNumArr.add(Integer.parseInt(num));
            }

            return intNumArr;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("지정되지 않은 문자");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("배열 크기가 이상합니다");
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("null 에러 발생");
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }


}
