package blog.ex.lombok.domain.getandset;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter(value = AccessLevel.PROTECTED, onMethod = @__(@NonNull))
@Setter(value = AccessLevel.PROTECTED, onParam = @__(@NonNull))
public class Member {
    private String email;
    private String name;
    private int age;
}
