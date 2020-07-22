package enumfield.ex.function;

import java.util.Arrays;

import enumfield.ex.controller.RunController;

public enum FunctionFieldMethod {
	ORDER(1, () -> {
		System.out.println("주문을 받습니다.");
	}),
	PAYMENT(2,() -> {
		System.out.println("결제를 진행합니다.");
	}),
	EXIT(3, () -> {
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
	});

	private final int number;
	private final RunController runController;

	FunctionFieldMethod(final int number, final RunController runController) {
		this.number = number;
		this.runController = runController;
	}

	public static FunctionFieldMethod of(int number){
		return Arrays.stream(FunctionFieldMethod.values())
			.filter(functionFieldMethod -> functionFieldMethod.isSameNumber(number))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("해당 기능을 찾을 수 없습니다."));
	}

	private boolean isSameNumber(int number){
		return this.number == number;
	}

	public void run() {
		runController.run();
	}
}