package blog.ex.lombok.domain.val;

import lombok.RequiredArgsConstructor;
import lombok.val;

@RequiredArgsConstructor
public class Member {
    private final String email;

    public String getEmail() {
        val email = "이메일 : " + this.email;
        return email;
    }
}
