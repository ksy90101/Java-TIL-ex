package blog.ex.lombok.domain.getandset;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberTest {
    @Test
    void getterTest() {
        Member member = new Member("럿고@gmail.com", "럿고", 28);
        assertThat(member.getEmail()).isEqualTo("럿고@gmail.com");
        assertThat(member.getName()).isEqualTo("럿고");
        assertThat(member.getAge()).isEqualTo(28);
    }
}
