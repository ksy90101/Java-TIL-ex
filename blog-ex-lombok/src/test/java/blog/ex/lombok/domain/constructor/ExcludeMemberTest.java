package blog.ex.lombok.domain.constructor;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExcludeMemberTest {
    @Test
    void forceTest() {
        AttributionMember attributionMember = new AttributionMember();
        assertThat(attributionMember).isNotNull();
    }

    @Test
    void onConstructorTest(){
        AttributionMember attributionMember =new AttributionMember("럿고@email.com","럿고");
        assertThat(attributionMember).isNotNull();
    }

    @Test
    void staticNameTest() {
        AttributionMember attributionMember =AttributionMember.create("럿고@email.com", "럿고", 28);
        assertThat(attributionMember).isNotNull();
    }
}
