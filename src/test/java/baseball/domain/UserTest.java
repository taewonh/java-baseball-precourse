package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class UserTest {

	@Test
	public void 정답_입력_테스트() {
		String input = "123";
		User user = setInInput(input);
		user.input();

		Assertions.assertEquals(input, user.getInput());
	}

	private User setInInput(String input) {
		Computer computer = new Computer();
		User user = new User();
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		return user;
	}
}
