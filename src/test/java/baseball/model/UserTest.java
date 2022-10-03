package baseball.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserTest extends AbstractDomainTest {

    @Test
    public void 숫자_입력_테스트() {
        String input = "123";
        User user = setInInput(input);
        Assertions.assertEquals(input.length(), user.getNumbers().size());
    }

    @Test
    public void 숫자가_아닌_문자_입력_테스트() {
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            User user = setInInput("Illegal Character");
        });
    }

    @Test
    public void 범위를_초과하는_숫자_입력_테스트() {
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            User user = setInInput("1234");
        });
    }
}
