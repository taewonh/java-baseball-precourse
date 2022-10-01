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

	@Test
	public void 숫자가_아닌_문자_입력_테스트() {
		Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
			User user = setInInput("Illegal Character");
			user.input();
		});
	}

	@Test
	public void 범위를_초과하는_숫자_입력_테스트() {
		Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
			User user = setInInput("1234");
			user.input();
		});
	}

	private User setInInput(String input) {
		Computer computer = new Computer();
		User user = new User(computer.getBallSize());
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		return user;
	}
}
