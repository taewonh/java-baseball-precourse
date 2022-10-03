package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RefereeTest extends AbstractDomainTest {

    @Test
    public void 게임_종료_판정_테스트() {
        Computer computer = new Computer();
        StringBuilder builder = new StringBuilder();
        for (int answer : computer.getNumbers()) {
            builder.append(String.valueOf(answer));
        }
        User user = setInInput(builder.toString());
        Referee referee = new Referee();
        referee.judgeInning(computer, user);
        Assertions.assertFalse(referee.continuesGame());
    }

    @Test
    public void 게임_계속_진행_테스트() {
        Computer computer = new Computer();
        List<Integer> answers = computer.getNumbers();
        List<Integer> noAnswers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int answer : answers) {
            // index가 아닌 Object로 remove 하기위해 Integer로 박싱하여 처리
            noAnswers.remove((Integer) answer);
        }

        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < 3; index++) {
            int noAnswer = noAnswers.get(index);
            builder.append(String.valueOf(noAnswer));
        }
        User user = setInInput(builder.toString());
        Referee referee = new Referee();
        referee.judgeInning(computer, user);
        Assertions.assertTrue(referee.continuesGame());
    }
}
