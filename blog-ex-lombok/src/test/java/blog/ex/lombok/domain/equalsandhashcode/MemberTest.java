package blog.ex.lombok.domain.equalsandhashcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberTest {
    @DisplayName("@EqualsAndHashCode 학습 테스트")
    @Test
    void equalsAndHashCodeTest() {
        Member member1 = new Member("럿고@gmail.com", "럿고", 28);
        Member member2 = new Member("럿고@gmail.com", "럿고", 28);
        assertThat(member1).isEqualTo(member2);
    }

    @DisplayName("Exclude 속성 학습테스트")
    @Test
    void excludeTest() {
        ExcludeMember member1 = new ExcludeMember("럿고@gmail.com", "럿고", 28);
        ExcludeMember member2 = new ExcludeMember("럿고@gmail.com", "럿고", 22);
        assertThat(member1).isEqualTo(member2);
    }

    @DisplayName("callSuper, of, onParam  속성 학습테스트")
    @Test
    void attributionTest() {
        AttributionMember member1 = new AttributionMember("럿고@gmail.com", "럿고", 28);
        AttributionMember member2 = new AttributionMember("럿@gmail.com", "럿고", 22);
        assertThat(member1).isEqualTo(member2);
    }
}
