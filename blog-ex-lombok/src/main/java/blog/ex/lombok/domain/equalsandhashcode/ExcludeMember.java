package blog.ex.lombok.domain.equalsandhashcode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode(exclude = "age")
public class ExcludeMember {
    private String email;
    private String name;
    private int age;
}
