package calculator.domain;

public class extractCustomDelimiter {

    // 커스텀 구분자 존재 확인
    public static boolean isExistCustomDelimiter(String input) {
        if (input.indexOf("//") == 0 && input.contains("\\n")) {   // 구분자가 하나가 아닐 경우 대비
            return true;
        } else {
            return false;
        }
    }

    public static String extractCustomDelimiter(String input) {
        try {// 커스텀 구분자가 제대로 있는 경우
            int endOfDelimiter = input.indexOf("\\n");
            String delimiter = input.substring(2, endOfDelimiter);
            return delimiter;
        } catch (Exception e) {
            throw new IllegalArgumentException("커스텀 구분자가 없는 input입니다.");
        }
    }

    public static String notCustomDelimiter(String input) {  // 커스텀 구분자 없앤 계산식
        if(isExistCustomDelimiter(input)) {
            int endOfDelimiter = input.indexOf("\\n") + 2;
            String newInput = input.substring(endOfDelimiter);
            return newInput;
        } else {
            throw new IllegalArgumentException("이미 커스텀 구분자가 없는 계산식입니다.");
        }
    }


}
