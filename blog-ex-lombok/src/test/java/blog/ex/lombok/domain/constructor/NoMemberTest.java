package blog.ex.lombok.domain.constructor;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NoMemberTest {
    @Test
    void noArgsConstructor() {
        NoMember noMember = new NoMember();
        assertThat(noMember).isNotNull();
    }
}
