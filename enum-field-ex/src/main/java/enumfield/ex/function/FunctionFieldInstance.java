package enumfield.ex.function;

import java.util.Arrays;

import enumfield.ex.controller.ExitController;
import enumfield.ex.controller.OrderController;
import enumfield.ex.controller.PaymentController;
import enumfield.ex.controller.RunController;

public enum FunctionFieldInstance {
	ORDER(1, new OrderController()),
	PAYMENT(2, new PaymentController()),
	EXIT(3, new ExitController());

	private final int number;
	private final RunController runController;

	FunctionFieldInstance(final int number, final RunController runController) {
		this.number = number;
		this.runController = runController;
	}

	public static FunctionFieldInstance of(int number){
		return Arrays.stream(FunctionFieldInstance.values())
			.filter(functionFieldInstance -> functionFieldInstance.isSameNumber(number))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("해당 기능을 찾을 수 없습니다."));
	}

	private boolean isSameNumber(int number){
		return this.number == number;
	}

	public void run() {
		System.out.println(runController.getClass().getName());
		runController.run();
	}
}
