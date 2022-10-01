package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ComputerTest {

	@Test
	public void 정답_생성_테스트() {
		int ballSize = 5;
		int startNum = 3;
		int endNum = 7;
		Computer computer = new Computer(5, 3, 7);
		List<Integer> answers = computer.getAnswers();

		Assertions.assertEquals(ballSize, answers.size());
		for (int count = startNum; count <= endNum; count++) {
			Assertions.assertTrue(answers.contains(count));
		}
	}
}
