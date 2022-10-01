package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ComputerTest {

	@Test
	public void 정답_생성_테스트() {
		Computer computer = new Computer();
		List<Integer> answers = computer.getAnswers();
		Assertions.assertEquals(3, answers.size());
	}
}
