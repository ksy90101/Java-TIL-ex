package blog.ex.lombok.domain.builder;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberTest {

    @DisplayName("@Builder 학습테스트")
    @Test
    void builderTest() {
        Member member = Member.builder()
                .email("럿고@gmail.com")
                .build();

        assertThat(member.getEmail()).isEqualTo("럿고@gmail.com");
        assertThat(member.getName()).isNull();;
    }
}
