package blog.ex.lombok.domain.constructor;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RequiredMemberTest {
    @Test
    void name() {
        RequiredMember requiredMember = new RequiredMember("럿고", "럿고@gmail.com");
        assertThat(requiredMember).isNotNull();
    }
}
