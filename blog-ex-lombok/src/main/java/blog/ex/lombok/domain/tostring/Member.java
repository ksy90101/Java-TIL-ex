package blog.ex.lombok.domain.tostring;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ToString()
public class Member {
    private String email;
    private String name;
    private int age;
}
