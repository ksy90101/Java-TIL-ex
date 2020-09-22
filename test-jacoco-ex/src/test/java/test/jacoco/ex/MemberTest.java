package test.jacoco.ex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberTest {

    @DisplayName("생성자 테스트")
    @Test
    void constructorTest() {
        Member member = new Member("rutgo", 28);

        assertEquals(member.getName(), "rutgo");
        assertEquals(member.getAge(), 28);
    }
}
