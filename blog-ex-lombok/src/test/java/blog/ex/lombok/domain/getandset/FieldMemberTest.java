package blog.ex.lombok.domain.getandset;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FieldMemberTest {
    @Test
    void fieldGetterTest() {
        FieldMember fieldMember = new FieldMember("럿고@gmail.com", "럿고", 28);
        assertThat(fieldMember.getEmail()).isEqualTo("럿고@gmail.com");
    }
}
