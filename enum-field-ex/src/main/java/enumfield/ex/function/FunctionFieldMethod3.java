package enumfield.ex.function;

import java.util.Arrays;

import enumfield.ex.controller.RunController;

public enum FunctionFieldMethod3 implements RunController {
	ORDER(1){
		@Override
		public void run() {
			System.out.println("주문을 받습니다.");
		}
	},
	PAYMENT(2){
		@Override
		public void run() {
			System.out.println("결제를 진행합니다.");
		}
	},
	EXIT(3){
		@Override
		public void run() {
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
	};

	private final int number;

	FunctionFieldMethod3(final int number) {
		this.number = number;
	}

	public abstract void run();

	public static FunctionFieldMethod3 of(int number){
		return Arrays.stream(FunctionFieldMethod3.values())
			.filter(functionFieldMethod -> functionFieldMethod.isSameNumber(number))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("해당 기능을 찾을 수 없습니다."));
	}

	private boolean isSameNumber(int number){
		return this.number == number;
	}
}