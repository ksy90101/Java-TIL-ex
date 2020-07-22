package jojoldu.aop.ex.Denpency;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jojoldu.aop.ex.common.User;

@RestController
public class DiUserController {
	private final DiSuperService<User> diUserService;

	public DiUserController(final DiSuperService<User> diUserService) {
		this.diUserService = diUserService;
	}

	@PostConstruct
	public void setup() {
		for (int i = 0; i < 100; i++) {
			diUserService.save(new User(i + "@email.com", i + "번째 사용자"));
		}
	}

	@GetMapping("/di/users")
	public List<User> getBoards() {
		return diUserService.getData();
	}
}