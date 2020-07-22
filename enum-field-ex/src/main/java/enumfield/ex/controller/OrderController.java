package enumfield.ex.controller;

public class OrderController implements RunController {
	@Override
	public void run() {
		System.out.println("주문을 받습니다.");
	}
}
