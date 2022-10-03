package baseball.model;

import java.util.List;

public class Referee {

    private int ball;
    private int strike;

    public void judgeInning(Computer computer, User user) {
        initBallCount();
        judgeBallCount(computer, user);
        printJudgeResult();
    }

    private void initBallCount() {
        ball = 0;
        strike = 0;
    }

    private void judgeBallCount(Computer computer, User user) {
        List<Integer> userNumbers = user.getNumbers();
        List<Integer> computerNumbers = computer.getNumbers();
        for (int userNumber : userNumbers) {
            increaseBallCount(userNumber, userNumbers.indexOf(userNumber), computerNumbers);
        }
    }

    private void increaseBallCount(int userNumber, int userNumberIndex, List<Integer> computerNumbers) {
        if (computerNumbers.indexOf(userNumber) == userNumberIndex) {
            strike++;
            return;
        }
        if (computerNumbers.contains(userNumber)) {
            ball++;
        }
    }

    private void printJudgeResult() {
        if (strike == 0 && ball == 0) {
            System.out.print("낫싱");
        }
        if (ball != 0) {
            System.out.print(ball + "볼 ");
        }
        if (strike != 0) {
            System.out.print(strike + "스트라이크 ");
        }
        System.out.println();
    }

    public boolean continuesGame() {
        return strike != 3;
    }
}