package blog.ex.lombok.domain.constructor;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllMemberTest {
    @Test
    void allArgsConstructorTest() {
        AllMember allMember = new AllMember("럿고@gmail.com", "럿고", 28);
        assertThat(allMember).isNotNull();
    }
}
