package calculator;

import calculator.domain.Calculate;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // 한줄 모두 입력받음'
        int result;
        if(input.equals("")) {
            result = 0;
        } else {
            result = Calculate.Calculate(input);
        }
        System.out.println("결과 : " + result);
    }
}
