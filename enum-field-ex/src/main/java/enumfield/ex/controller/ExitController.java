package enumfield.ex.controller;

public class ExitController implements RunController {
	@Override
	public void run() {
		System.out.println("시스템을 종료합니다.");
		System.exit(0);
	}
}
