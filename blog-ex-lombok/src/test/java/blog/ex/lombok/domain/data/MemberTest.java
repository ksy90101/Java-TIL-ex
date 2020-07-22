package blog.ex.lombok.domain.data;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberTest {

    @DisplayName("getter & setter 학습 테스트")
    @Test
    void getterTest() {
        Member member = Member.create();
        member.setEmail("럿고@gmail.com");
        member.setName("럿고");
        member.setAge(28);
        assertThat(member.getEmail()).isEqualTo("럿고@gmail.com");
        assertThat(member.getName()).isEqualTo("럿고");
        assertThat(member.getAge()).isEqualTo(28);
    }

    @DisplayName("Equals 학습테스트")
    @Test
    void testEquals() {
        Member member = Member.create();
        member.setEmail("럿고@gmail.com");
        member.setName("럿고");
        member.setAge(28);

        Member expected = Member.create();
        expected.setEmail("럿고@gmail.com");
        expected.setName("럿고");
        expected.setAge(28);

        assertThat(member).isEqualTo(expected);
    }

    @DisplayName("toString 학습테스트")
    @Test
    void testToString() {
        Member member = Member.create();
        member.setEmail("럿고@gmail.com");
        member.setName("럿고");
        member.setAge(28);
        assertThat(member.toString()).isEqualTo("Member(email=럿고@gmail.com, name=럿고, age=28)");
    }

    @DisplayName("canEqual 학습테스트")
    @Test
    void canEqualTest() {
        Member member = Member.create();
        member.setEmail("럿고@gmail.com");
        member.setName("럿고");
        member.setAge(28);

        Member expected = Member.create();

        assertThat(member.canEqual(expected)).isTrue();
    }
}
