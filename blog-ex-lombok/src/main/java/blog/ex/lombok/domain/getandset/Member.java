package blog.ex.lombok.domain.getandset;

import blog.ex.lombok.annotation.BasicAnnotation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter(value = AccessLevel.PROTECTED, onMethod = @__(@NonNull))
@Setter(value = AccessLevel.PROTECTED, onParam = @__(@BasicAnnotation))
public class Member {
    private String email;
    private String name;
    private int age;
}
