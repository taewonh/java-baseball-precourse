package baseball.model;

import java.util.List;

public class Referee {

    private int ballCount;
    private int strikeCount;

    public void judgeInning(Computer computer, User user) {
        initBallCount();
        judgeBallCount(computer, user);
        printJudgeResult();
    }

    private void initBallCount() {
        ballCount = 0;
        strikeCount = 0;
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
            strikeCount++;
            return;
        }
        if (computerNumbers.contains(userNumber)) {
            ballCount++;
        }
    }

    private void printJudgeResult() {
        if (strikeCount == 0 && ballCount == 0) {
            System.out.print("낫싱");
        }
        if (ballCount != 0) {
            System.out.print(ballCount + "볼 ");
        }
        if (strikeCount != 0) {
            System.out.print(strikeCount + "스트라이크 ");
        }
        System.out.println();
    }

    public boolean continuesGame() {
        return strikeCount != 3;
    }
}