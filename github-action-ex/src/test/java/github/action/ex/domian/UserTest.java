package github.action.ex.domian;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest {

    @DisplayName("생성자 확인")
    @Test
    void constructorTest() {
        User user = new User("럿고", 28);
        assertThat(user.getAge()).isEqualTo(28);
    }
}
