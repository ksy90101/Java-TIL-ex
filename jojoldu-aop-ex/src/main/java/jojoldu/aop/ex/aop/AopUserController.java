package jojoldu.aop.ex.aop;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jojoldu.aop.ex.common.History;
import jojoldu.aop.ex.common.User;

@RestController
public class AopUserController {
	private final AopUserService aopUserService;

	public AopUserController(final AopUserService aopUserService) {
		this.aopUserService = aopUserService;
	}

	@PostConstruct
	public void setup() {
		for (int i = 0; i < 100; i++) {
			aopUserService.save(new User(i + "@email.com", i + "번째 사용자"));
		}
	}

	@GetMapping("/aop/users")
	public List<User> getBoards() {
		return aopUserService.findAll();
	}

	@PutMapping("/aop/users")
	public History getBoards(@RequestBody User user) {
		aopUserService.updateUser(user);
		return aopUserService.findHistoryBy(user.getId());
	}
}
