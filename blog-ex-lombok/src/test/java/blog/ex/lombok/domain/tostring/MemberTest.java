package blog.ex.lombok.domain.tostring;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import blog.ex.lombok.domain.constructor.AttributionMember;

class MemberTest {

    @DisplayName("toString 학습 테스트")
    @Test
    void toStringTest() {
        Member member = new Member("럿고@gmail.com", "럿고", 28);
        assertThat(member.toString()).isEqualTo("Member(email=럿고@gmail.com, name=럿고, age=28)");
    }

    @DisplayName("toString exclude 속성 학습 테스트")
    @Test
    void toStringExcludeTest() {
        ExcludeMember excludeMember = new ExcludeMember("럿고@gmail.com", "럿고", 28);
        assertThat(excludeMember.toString()).isEqualTo("ExcludeMember(email=럿고@gmail.com, age=28)");
    }

    @DisplayName("toString includeFieldNames, of, callSuper, doNotUserGetters 속성 학습 테스")
    @Test
    void attributesTest() {
        AttributesMember attributionMember = new AttributesMember(1L,"럿고@gmail.com", "럿고", 28);
        assertThat(attributionMember.toString()).isEqualTo("AttributesMember(super=SuperMember(id=1), 럿고@gmail.com, 28)");
    }
}
