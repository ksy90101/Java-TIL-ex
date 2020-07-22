package blog.ex.lombok.domain.val;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberTest {

    @DisplayName("val 학습테스트")
    @Test
    void valTest() {
        Member member = new Member("럿고@gmail.com");
        assertThat(member.getEmail()).isEqualTo("이메일 : 럿고@gmail.com");
    }
}
