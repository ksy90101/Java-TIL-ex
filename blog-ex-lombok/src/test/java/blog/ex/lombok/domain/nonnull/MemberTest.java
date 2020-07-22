package blog.ex.lombok.domain.nonnull;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberTest {
    @DisplayName("@NonNull 학습테스트")
    @Test
    void nonNullTest() {
        assertThatThrownBy(() ->  new Member(null)).isInstanceOf(NullPointerException.class);
    }
}
