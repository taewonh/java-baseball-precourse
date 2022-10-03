package baseball.controller;

import baseball.model.Computer;
import baseball.model.Referee;
import baseball.model.User;


public class GameController {

    private final Computer computer;

    private final User user;

    private final Referee referee;

    public GameController() {
        computer = new Computer();
        user = new User();
        referee = new Referee();
    }

    public void start() {
        while (referee.continuesGame()) {
            user.inputNumber();
            referee.judgeInning(computer, user);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}