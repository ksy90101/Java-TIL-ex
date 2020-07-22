package jojoldu.aop.ex.basic;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jojoldu.aop.ex.common.User;

@RestController
public class UserController {
	private final UserService userService;

	public UserController(final UserService userService) {
		this.userService = userService;
	}

	@PostConstruct
	public void setup() {
		for (int i = 0; i < 100; i++) {
			userService.save(new User(i + "@email.com", i + "번째 사용자"));
		}
	}

	@GetMapping("/users")
	public List<User> getBoards() {
		return userService.findAll();
	}
}
