package blog.ex.lombok.domain.equalsandhashcode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode()
public class Member {
    private String email;
    private String name;
    private int age;
}
