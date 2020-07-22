package jojoldu.aop.ex.inheritance;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jojoldu.aop.ex.common.User;

@RestController
public class InheritUserController {
	private final InheritUserService inheritUserService;

	public InheritUserController(final InheritUserService inheritUserService) {
		this.inheritUserService = inheritUserService;
	}

	@PostConstruct
	public void setup() {
		for (int i = 0; i < 100; i++) {
			inheritUserService.save(new User(i + "@email.com", i + "번째 사용자"));
		}
	}

	@GetMapping("/inherit/users")
	public List<User> getBoards() {
		return inheritUserService.getData();
	}
}
