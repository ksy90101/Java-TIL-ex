package blog.ex.lombok.domain.tostring;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString(exclude = "name")
public class ExcludeMember {
    private String email;
    private String name;
    private int age;
}
