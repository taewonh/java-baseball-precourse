package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Computer {

	private List<Integer> answers;

	public Computer() {
		answers = new ArrayList<>();
		generateAnswers();
	}

	private void generateAnswers() {
		Set<Integer> pickBox = generatePickBox();
		for (int count = 0; count < 3; count++) {
			answers.add(pickAnswer(pickBox));
		}
	}

	private Set<Integer> generatePickBox() {
		Set<Integer> pickBox = new HashSet<>();
		for (int num = 1; num <= 9; num++) {
			pickBox.add(num);
		}
		return pickBox;
	}

	private int pickAnswer(Set<Integer> pickBox) {
		boolean allowPick = true;
		int answer = 0;
		while (allowPick) {
			answer = Randoms.pickNumberInRange(1, 9);
			allowPick = !pickBox.contains(answer);
		}
		pickBox.remove(answer);
		return answer;
	}

	public List<Integer> getAnswers() {
		return answers;
	}
}
