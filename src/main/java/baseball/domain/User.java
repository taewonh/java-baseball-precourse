package baseball.domain;

import camp.nextstep.edu.missionutils.Console;

public class User {
	private final int ballSize;
	private String input;

	private User() {
		this.ballSize = 0;
	}
	public User(int ballSize) {
		this.ballSize = ballSize;
	}

	public void input() {
		System.out.print("숫자를 입력해주세요 :");
		this.input = Console.readLine();
		validateInput();
	}

	private void validateInput() {
		try {
			int parseInt = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("숫자로 이루어진 문자만 입력할 수 있습니다.");
		}
		if (input.length() != ballSize) {
			throw new IllegalArgumentException("입력한 숫자는 정해진 범위를 초과했습니다.");
		}
	}

	public String getInput() {
		return input;
	}
}
