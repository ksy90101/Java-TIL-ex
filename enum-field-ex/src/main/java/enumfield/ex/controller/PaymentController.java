package enumfield.ex.controller;

public class PaymentController implements RunController {
	@Override
	public void run() {
		System.out.println("결제를 진행합니다.");
	}
}
