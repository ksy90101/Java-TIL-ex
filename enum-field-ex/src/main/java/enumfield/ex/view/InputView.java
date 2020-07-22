package enumfield.ex.view;

import java.util.Scanner;

public class InputView {
	private static final Scanner scanner = new Scanner(System.in);

	public static int inputFunctionNumber() {
		System.out.println("해당 기능의 번호를 입력해주세요.");
		System.out.println("1 - 주문");
		System.out.println("2 - 결제");
		System.out.println("3 - 종료");
		return scanner.nextInt();
	}
}
