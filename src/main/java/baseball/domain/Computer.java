package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Computer {

	private int ballSize = 3;

	private int startNum = 1;

	private int endNum = 9;

	private List<Integer> answers;

	public Computer() {
		init();
	}

	public Computer(int ballSize, int startNum, int endNum) {
		this.ballSize = ballSize;
		this.startNum = startNum;
		this.endNum = endNum;
		init();
	}

	private void init() {
		answers = new ArrayList<>(ballSize);
		generateAnswers();
	}

	private void generateAnswers() {
		Set<Integer> pickBox = generatePickBox();
		for (int count = 0; count < ballSize; count++) {
			answers.add(pickAnswer(pickBox));
		}
	}

	private Set<Integer> generatePickBox() {
		Set<Integer> pickBox = new HashSet<>();
		for (int num = startNum; num <= endNum; num++) {
			pickBox.add(num);
		}
		return pickBox;
	}

	private int pickAnswer(Set<Integer> pickBox) {
		boolean allowPick = true;
		int answer = 0;
		while (allowPick) {
			answer = Randoms.pickNumberInRange(startNum, endNum);
			allowPick = !pickBox.contains(answer);
		}
		pickBox.remove(answer);
		return answer;
	}

	public List<Integer> getAnswers() {
		return answers;
	}

	public int getBallSize() {
		return ballSize;
	}
}
