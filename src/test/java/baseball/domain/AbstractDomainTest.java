package baseball.domain;

import java.io.ByteArrayInputStream;

public class AbstractDomainTest {

	User setInInput(String input) {
		User user = new User();
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		return user;
	}
}
