package calculator.domain;

import java.util.ArrayList;

public class Calculate {
    public static Integer Calculate(ArrayList<Integer> intNumArr) {
        int sum = 0;
        for(Integer num : intNumArr) {
            sum += num;
        }
        return sum;
    }
}
