package baseball.domain;

import camp.nextstep.edu.missionutils.Console;

public class User {
	private String input;

	public void input() {
		System.out.print("숫자를 입력해주세요 :");
		this.input = Console.readLine();
	}

	public String getInput() {
		return input;
	}
}
