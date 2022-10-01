package baseball.domain;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class User {
	private List<Integer> numbers;

	public void input() {
		System.out.print("숫자를 입력해주세요 :");
		String input = Console.readLine();
		validateInput(input);
		inputNumber(input);
	}

	private void validateInput(String input) {
		try {
			int parseInt = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("숫자로 이루어진 문자만 입력할 수 있습니다.");
		}
		if (input.length() != 3) {
			throw new IllegalArgumentException("입력한 숫자는 정해진 범위를 초과했습니다.");
		}
	}

	private void inputNumber(String input) {
		String[] split = input.split("");
		for (int index = 0; index < split.length; index++) {
			String num = split[index];
			numbers.add(Integer.parseInt(num));
		}
	}

	public List<Integer> getNumbers() {
		return numbers;
	}
}
