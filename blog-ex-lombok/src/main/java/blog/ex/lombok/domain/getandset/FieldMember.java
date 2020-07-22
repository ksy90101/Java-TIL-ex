package blog.ex.lombok.domain.getandset;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class FieldMember {
    @Getter
    private final String email;
    private final String name;
    private int age;
}
